package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.StateEntity;
import toeic.App.Repository.StateDao;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public class StateDaoImp extends CRUDRepositoryImp<StateEntity,Integer> implements StateDao{
    @Override
    public StateEntity findById(int id) {
        return this.findOne(id);
    }
}
