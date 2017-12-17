package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.QuestionPartTwoDto;
import toeic.App.Service.QuestionPartTwoService;
import toeic.App.WebService.CRUDRestImpl;

/**
 * Created by chien on 29/11/2017.
 */
@RestController()
@RequestMapping("/home")
public class QuestionPartTwoRest extends CRUDRestImpl<QuestionPartTwoDto, Long> {

    @Autowired
    public QuestionPartTwoRest(QuestionPartTwoService questionPartTwoService) {
        super(questionPartTwoService);
    }

}
