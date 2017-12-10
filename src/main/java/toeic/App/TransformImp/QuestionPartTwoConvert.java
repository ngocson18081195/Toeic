package toeic.App.TransformImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import toeic.App.DTO.QuestionPartTwoDto;
import toeic.App.Entity.QuestionPartTwoEntity;
import toeic.App.Utils.ServiceFiles;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by chien on 29/11/2017.
 */
@Component
@Qualifier(value = "convertPartTwo")
public class QuestionPartTwoConvert extends ConvertImpl<QuestionPartTwoEntity, QuestionPartTwoDto> {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionPartTwoConvert.class);
    private ServiceFiles serviceFiles;

    @Autowired
    public QuestionPartTwoConvert(ServiceFiles serviceFiles) {
        this.serviceFiles = serviceFiles;
    }

    @Override
    public QuestionPartTwoEntity convertToEntity(QuestionPartTwoDto questionPartTwoDto) {
        LOGGER.info("Convert Question Part Two From Data To Entity", questionPartTwoDto.toString());
        QuestionPartTwoEntity questionPartTwoEntity = new QuestionPartTwoEntity();
        questionPartTwoEntity.setScriptOne(questionPartTwoDto.getScriptOne());
        questionPartTwoEntity.setScriptTwo(questionPartTwoDto.getScriptTwo());
        questionPartTwoEntity.setScriptThree(questionPartTwoDto.getScriptThree());
        questionPartTwoEntity.setQuestion(questionPartTwoDto.getQuestion());
        questionPartTwoEntity.setResult(questionPartTwoDto.getAnswer());
        return questionPartTwoEntity;
    }

    @Override
    public <K extends Serializable> QuestionPartTwoEntity convertToEntity(QuestionPartTwoDto questionPartTwoDto, K k) {
        QuestionPartTwoEntity questionPartTwoEntity = this.convertToEntity(questionPartTwoDto);
        questionPartTwoEntity.setId((Long) k);
        return questionPartTwoEntity;
    }

    @Override
    public QuestionPartTwoDto convertToData(QuestionPartTwoEntity questionPartTwoEntity) throws IOException {
        QuestionPartTwoDto questionPartTwoDto = new QuestionPartTwoDto();
        questionPartTwoDto.setScriptOne(questionPartTwoEntity.getScriptOne());
        questionPartTwoDto.setScriptTwo(questionPartTwoEntity.getScriptTwo());
        questionPartTwoDto.setScriptThree(questionPartTwoEntity.getScriptThree());
        questionPartTwoDto.setQuestion(questionPartTwoEntity.getQuestion());
        questionPartTwoDto.setAnswer(questionPartTwoEntity.getResult());
        questionPartTwoDto.setBytes(this.serviceFiles.getByteFromPath(questionPartTwoEntity.getPathMp3()));
        return questionPartTwoDto;
    }

}
