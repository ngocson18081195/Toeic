package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Service.QuestionPartOneService;
import toeic.App.WebService.PartOneWS;

import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@RestController
public class PartOneWSImp implements PartOneWS{
    @Autowired
    private QuestionPartOneService questionPartOneService;


    @Override
    public ResponseEntity create() {
        QuestionPartOneEntity questionPartOneEntity = new QuestionPartOneEntity();
        questionPartOneEntity.setScriptOne("AASDASD");
        questionPartOneService.save(questionPartOneEntity);
        return ResponseEntity.ok(questionPartOneEntity);
    }

    @Override
    public ResponseEntity findAll() {
        List<QuestionPartOneEntity> list = questionPartOneService.list();
        return ResponseEntity.ok(list);
    }
}
