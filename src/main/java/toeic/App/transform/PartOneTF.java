package toeic.App.transform;

import toeic.App.DTO.PartOneDto;
import toeic.App.Entity.QuestionPartOneEntity;

/**
 * Created by ngocson on 25/11/2017.
 */
public interface PartOneTF {
    QuestionPartOneEntity convertPartOneDtotoEntity(PartOneDto partOneDto);
    PartOneDto convertPartOneEntitytoDTO(QuestionPartOneEntity questionPartOneEntity);
}
