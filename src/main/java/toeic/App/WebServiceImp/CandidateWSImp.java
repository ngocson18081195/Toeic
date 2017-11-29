package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.CandidateDTO;
import toeic.App.DTO.StateDTO;
import toeic.App.Entity.StateEntity;
import toeic.App.Repository.CandidateDao;
import toeic.App.Repository.StateDao;
import toeic.App.Service.CandidateService;
import toeic.App.Service.StateService;
import toeic.App.WebService.CandidateWS;

/**
 * Created by ngocson on 29/11/2017.
 */
@RestController
public class CandidateWSImp implements CandidateWS {
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private StateService stateService;

    @Override
    public ResponseEntity save() {
        CandidateDTO candidateDTO = new CandidateDTO();
        StateDTO stateEntity = stateService.findByOne(1);
        candidateDTO.setName("S");
        candidateDTO.setAddress("71/21/11A");
        candidateDTO.setStateDTO(stateEntity);
        candidateService.createDTO(candidateDTO);
        return ResponseEntity.ok(candidateDTO);
    }

    @Override
    public ResponseEntity list() {
        return ResponseEntity.ok(candidateService.findAllCandidateDTO());
    }
}
