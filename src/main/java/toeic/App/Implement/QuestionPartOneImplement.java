package toeic.App.Implement;

import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Repository.QuestionPartOneRepository;
import toeic.App.Service.QuestionPartOneService;
import toeic.Common.Service.CRUDServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chien on 17/11/2017.
 */
@Service
public class QuestionPartOneImplement extends CRUDServiceImpl<QuestionPartOneEntity,
        Long,
        QuestionPartOneRepository> implements QuestionPartOneService {

    @Autowired
    public QuestionPartOneImplement(QuestionPartOneRepository questionPartOneRepository) {
        super(questionPartOneRepository);
    }


}
