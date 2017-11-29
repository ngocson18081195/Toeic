package toeic.App.transform;

import toeic.App.DTO.CandidateDTO;
import toeic.App.DTO.PartOneDto;
import toeic.App.DTO.StateDTO;
import toeic.App.Entity.CandidateEntity;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Entity.StateEntity;

import java.util.List;

/**
 * Created by ngocson on 25/11/2017.
 */
public interface PartOneTF {
    QuestionPartOneEntity convertPartOneDtotoEntity(PartOneDto partOneDto);
    PartOneDto convertPartOneEntitytoDTO(QuestionPartOneEntity questionPartOneEntity);
    List<PartOneDto> convertListEtntiytoDTO(List<QuestionPartOneEntity> questionPartOneEntities );
    CandidateEntity convertDTOtoEntity(CandidateDTO candidateDTO);
    List<CandidateDTO> convertList(List<CandidateEntity> candidateEntities);
    StateDTO convertEntitytoDto(StateEntity stateEntity);
}
