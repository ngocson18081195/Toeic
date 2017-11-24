package toeic.App.ServiceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Repository.QuestionPartOneDao;
import toeic.App.Service.QuestionPartOneService;

import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@Service
@Transactional
public class PartOneServiceImp implements QuestionPartOneService {

    private final static Logger logger = LoggerFactory.getLogger(PartOneServiceImp.class);

    @Autowired
    private QuestionPartOneDao questionPartOneDao;

    @Override
    public QuestionPartOneEntity findOne(Long aLong) {
        return null;
    }

    @Override
    public QuestionPartOneEntity save(QuestionPartOneEntity questionPartOneEntity) {
        logger.info("Create Part One Service");
        return questionPartOneDao.create(questionPartOneEntity);
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public List<QuestionPartOneEntity> list() {
        logger.info("Find All Part One Service");
        return questionPartOneDao.LIST();
    }
}
