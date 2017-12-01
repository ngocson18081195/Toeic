package toeic.App.RepositoryImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import toeic.App.Entity.QuestionPartOneEntity;
import toeic.App.Repository.QuestionPartOneDao;

import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@Repository
public class PartOneImp extends CRUDRepositoryImp<QuestionPartOneEntity,Long> implements QuestionPartOneDao {

    private final static Logger logger = LoggerFactory.getLogger(PartOneImp.class);

    /**
     * Method Create PartOne Entity
     * @param questionPartOneEntity
     * @return PartOneEntity
     */
    @Override
    public QuestionPartOneEntity create(QuestionPartOneEntity questionPartOneEntity) {
        logger.info("Create Part One Dao");
        return this.save(questionPartOneEntity);
    }

    @Override
    public List<QuestionPartOneEntity> LIST() {
        logger.info("Find All Dao");
        return this.findAll();
    }

    @Override
    public QuestionPartOneEntity findByName(String name) {

        return null;
    }

    @Override
    public void delete(QuestionPartOneEntity questionPartOneEntity) {

    }

    /**
     *
     * Method Find One PartOne Entity
     *
     * @param id
     * @return PartOneEntity
     */
    @Override
    public QuestionPartOneEntity findByOne(Long id) {
        return this.findOne(id);
    }


}
