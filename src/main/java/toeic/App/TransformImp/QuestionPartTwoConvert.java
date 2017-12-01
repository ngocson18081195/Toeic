package toeic.App.TransformImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import toeic.App.DTO.QuestionPartTwoDto;
import toeic.App.Entity.QuestionPartTwoEntity;
import toeic.App.Transform.Convert;
import toeic.App.Utils.ServiceFiles;

import java.io.IOException;

/**
 * Created by chien on 29/11/2017.
 */
@Component
public class QuestionPartTwoConvert implements Convert<QuestionPartTwoEntity, QuestionPartTwoDto> {

    private ServiceFiles serviceFiles;

    @Autowired
    public QuestionPartTwoConvert(ServiceFiles serviceFiles) {
        this.serviceFiles = serviceFiles;
    }

    @Override
    public QuestionPartTwoEntity convertToEntity(QuestionPartTwoDto questionPartTwoDto) {
        QuestionPartTwoEntity questionPartTwoEntity = new QuestionPartTwoEntity();
        return questionPartTwoEntity;
    }

    @Override
    public QuestionPartTwoDto convertToData(QuestionPartTwoEntity questionPartTwoEntity) throws IOException {
        QuestionPartTwoDto questionPartTwoDto = new QuestionPartTwoDto();
        questionPartTwoDto.setScriptOne(questionPartTwoEntity.getScriptOne());
        questionPartTwoDto.setScriptTwo(questionPartTwoEntity.getScriptTwo());
        questionPartTwoDto.setScriptThree(questionPartTwoEntity.getScriptThree());
        questionPartTwoDto.setQuestion(questionPartTwoEntity.getQuestion());
        questionPartTwoDto.setBytes(this.serviceFiles.getByteFromPath(questionPartTwoEntity.getPathMp3()));
        return questionPartTwoDto;
    }

}
