package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.AccountEntity;
import toeic.App.RepositoryImp.CRUDRepositoryImp;

/**
 * Created by lai on 06/12/2017.
 */
@Repository
public interface AccountRepository extends CRUDRepository<AccountEntity,Long> {

}
