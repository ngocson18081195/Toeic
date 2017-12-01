package toeic.App.Service;

import toeic.App.DTO.PartOneDto;

/**
 * Created by chien on 17/11/2017.
 */

public interface QuestionPartOneService extends CRUDService<PartOneDto, Long> {
    boolean checkUpdatedDate(PartOneDto partOneDto);
}
