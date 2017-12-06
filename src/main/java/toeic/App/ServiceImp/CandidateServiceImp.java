package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toeic.App.DTO.CandidateDTO;
import toeic.App.Entity.CandidateEntity;
import toeic.App.Repository.AddressDao;
import toeic.App.Repository.CandidateDao;
import toeic.App.Service.CandidateService;
import toeic.App.Transform.PartOneTF;

import java.util.List;

/**
 * Created by ngocson on 29/11/2017.
 */
@Service
@Transactional
public class CandidateServiceImp implements CandidateService {
    @Autowired
    private CandidateDao candidateDao;
    @Autowired
    private PartOneTF partOneTF;
    @Autowired
    private AddressDao addressDao;
    @Override
    public CandidateDTO createDTO(CandidateDTO candidateDTO) {
        CandidateEntity candidateEntity = partOneTF.convertDTOtoEntity(candidateDTO);
        candidateDao.createCandidate(candidateEntity);
        addressDao.createAddress(candidateEntity.getAddressEntity());
        return candidateDTO;
    }

    @Override
    public List<CandidateDTO> findAllCandidateDTO() {
        List<CandidateEntity> list = candidateDao.getAll();
        List<CandidateDTO> candidateDTOList = partOneTF.convertList(list);
        return candidateDTOList;
    }
}
