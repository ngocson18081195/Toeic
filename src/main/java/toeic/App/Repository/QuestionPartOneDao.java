package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.QuestionPartOneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by chien on 17/11/2017.
 */
@Repository
public interface QuestionPartOneDao {

    QuestionPartOneEntity create(QuestionPartOneEntity questionPartOneEntity);

    List<QuestionPartOneEntity> LIST();

    QuestionPartOneEntity findByName(String name);

    void delete(QuestionPartOneEntity questionPartOneEntity);

    QuestionPartOneEntity findByOne(Long id);
}
