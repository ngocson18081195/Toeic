package toeic.App.transformImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.CandidateDTO;
import toeic.App.DTO.PartOneDto;
import toeic.App.DTO.StateDTO;
import toeic.App.Entity.AddressEntity;
import toeic.App.Entity.CandidateEntity;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Entity.StateEntity;
import toeic.App.transform.PartOneTF;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by ngocson on 25/11/2017.
 */
@Service
public class PartOneTFImp implements PartOneTF {
    @Override
    public QuestionPartOneEntity convertPartOneDtotoEntity(PartOneDto partOneDto) {
        QuestionPartOneEntity questionPartOneEntity = new QuestionPartOneEntity();
        questionPartOneEntity.setPathImage(partOneDto.getPathImage());
        questionPartOneEntity.setPathMp3(partOneDto.getPathMp3());
        questionPartOneEntity.setScriptOne(partOneDto.getScriptOne());
        questionPartOneEntity.setScriptTwo(partOneDto.getScriptTwo());
        questionPartOneEntity.setScriptThree(partOneDto.getScriptThree());
        questionPartOneEntity.setScriptFour(partOneDto.getScriptFour());
        return questionPartOneEntity;
    }

    @Override
    public PartOneDto convertPartOneEntitytoDTO(QuestionPartOneEntity questionPartOneEntity) {
        PartOneDto partOneDto = new PartOneDto();
        partOneDto.setPathImage(questionPartOneEntity.getPathImage());
        partOneDto.setPathMp3(questionPartOneEntity.getPathMp3());
        partOneDto.setScriptOne(questionPartOneEntity.getScriptOne());
        partOneDto.setScriptTwo(questionPartOneEntity.getScriptTwo());
        partOneDto.setScriptThree(questionPartOneEntity.getScriptThree());
        partOneDto.setScriptFour(questionPartOneEntity.getScriptFour());
        return partOneDto;
    }

    @Override
    public List<PartOneDto> convertListEtntiytoDTO(List<QuestionPartOneEntity> questionPartOneEntities) {
        List<PartOneDto> dtoList = new ArrayList<>();

        for (QuestionPartOneEntity partOneEntity: questionPartOneEntities){
            PartOneDto partOneDto = new PartOneDto();
            partOneDto.setId(partOneEntity.getId());
            partOneDto.setPathImage(partOneEntity.getPathImage());
            partOneDto.setPathMp3(partOneEntity.getPathMp3());
            partOneDto.setScriptOne(partOneEntity.getScriptOne());
            partOneDto.setScriptTwo(partOneEntity.getScriptTwo());
            partOneDto.setScriptThree(partOneEntity.getScriptThree());
            partOneDto.setScriptFour(partOneEntity.getScriptFour());
            dtoList.add(partOneDto);
        }
        return dtoList;
    }
    public StateEntity convertEntity(StateDTO stateDTO){
        StateEntity stateEntity = new StateEntity();
        stateEntity.setId(stateDTO.getId());
        stateEntity.setName(stateDTO.getName());
        stateEntity.setCoutryEntity(stateDTO.getCoutryEntity());
        return stateEntity;
    }
    @Override
    public CandidateEntity convertDTOtoEntity(CandidateDTO candidateDTO) {
        CandidateEntity candidateEntity = new CandidateEntity();
        StateEntity stateEntity = convertEntity(candidateDTO.getStateDTO());
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setName(candidateDTO.getAddress());
        addressEntity.setStateEntity(stateEntity);
        candidateEntity.setName(candidateDTO.getName());
        candidateEntity.setAddressEntity(addressEntity);
        return candidateEntity;
    }

    @Override
    public List<CandidateDTO> convertList(List<CandidateEntity> candidateEntities) {
        List<CandidateDTO> dtoList = new ArrayList<>();
        for (CandidateEntity entity:candidateEntities){
            CandidateDTO candidateDTO = new CandidateDTO();
            candidateDTO.setId(entity.getId());
            candidateDTO.setName(entity.getName());
            candidateDTO.setAddress(entity.getAddressEntity().getName());
            StateDTO stateDTOS = convertEntitytoDto(entity.getAddressEntity().getStateEntity());
            candidateDTO.setStateDTO(stateDTOS);
            dtoList.add(candidateDTO);
        }
        return dtoList;
    }

    @Override
    public StateDTO convertEntitytoDto(StateEntity stateEntity) {
        StateDTO stateDTO = new StateDTO();
        stateDTO.setId(stateEntity.getId());
        stateDTO.setName(stateEntity.getName());
        stateDTO.setCoutryEntity(stateEntity.getCoutryEntity());
        return stateDTO;
    }
}
