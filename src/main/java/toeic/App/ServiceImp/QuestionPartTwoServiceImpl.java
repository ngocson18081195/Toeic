package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import toeic.App.DTO.QuestionPartTwoDto;
import toeic.App.Entity.QuestionPartTwoEntity;
import toeic.App.Repository.QuestionPartTwoDao;
import toeic.App.Service.QuestionPartTwoService;
import toeic.App.Transform.Convert;

import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
@Service
public class QuestionPartTwoServiceImpl
        extends CRUDServiceImpl<QuestionPartTwoDto, Long, QuestionPartTwoEntity>
        implements QuestionPartTwoService {
    @Autowired
    public QuestionPartTwoServiceImpl(@Qualifier(value = "convertPartTwo") Convert<QuestionPartTwoEntity, QuestionPartTwoDto> convert,
                                      QuestionPartTwoDao questionPartTwoDao) {
        super(convert, questionPartTwoDao);
    }


}
