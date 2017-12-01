package toeic.App.TransformImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.PartOneDto;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Transform.PartOneTF;

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
}
