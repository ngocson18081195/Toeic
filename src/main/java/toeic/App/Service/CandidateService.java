package toeic.App.Service;

import org.springframework.stereotype.Service;
import toeic.App.DTO.CandidateDTO;
import toeic.App.Repository.CandidateDao;

import java.util.List;

/**
 * Created by ngocson on 29/11/2017.
 */
@Service
public interface CandidateService{
    CandidateDTO createDTO(CandidateDTO candidateDTO);
    List<CandidateDTO> findAllCandidateDTO();
}
