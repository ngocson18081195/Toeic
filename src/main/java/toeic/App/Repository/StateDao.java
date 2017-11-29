package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.StateEntity;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public interface StateDao {
    StateEntity findById(int id);
}
