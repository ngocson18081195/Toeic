package toeic.App.WebServiceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.PartOneDto;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Service.QuestionPartOneService;
import toeic.App.WebService.PartOneWS;

import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@RestController
public class PartOneWSImp implements PartOneWS{
    private final static Logger logger = LoggerFactory.getLogger(PartOneWSImp.class);
    @Autowired
    private QuestionPartOneService questionPartOneService;


    @Override
    public ResponseEntity create() {
        logger.info("Start up Create Part One RestController");
        PartOneDto partOneDto = new PartOneDto();
        partOneDto.setPathImage("S");
        partOneDto.setPathMp3("O");
        questionPartOneService.save(partOneDto);

        return ResponseEntity.ok(partOneDto);
    }

    @Override
    public ResponseEntity findAll() {
        List<PartOneDto> list = questionPartOneService.list();
        return ResponseEntity.ok(list);
    }

    @Override
    public ResponseEntity findOne(@PathVariable(name = "id") Long id) {
        System.out.println(id);
        PartOneDto partOneDto = questionPartOneService.findOne(id);
        return ResponseEntity.ok(partOneDto);
    }
}
