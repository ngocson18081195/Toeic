package toeic.App.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.Common.Rest.Control.RestControl;
import toeic.Common.Service.CRUDService;

/**
 * Created by ngocson on 20/11/2017.
 */
@RestController
@RequestMapping(value = "/api/partone")
public class PartOne extends RestControl<QuestionPartOneEntity,Long>{

    @Autowired
    public PartOne(CRUDService<QuestionPartOneEntity, Long> crudService) {
        super(crudService);
    }
}
