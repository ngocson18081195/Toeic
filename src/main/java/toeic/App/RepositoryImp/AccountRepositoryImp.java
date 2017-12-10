package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.AccountEntity;
import toeic.App.Repository.AccountRepository;

/**
 * Created by lai on 06/12/2017.
 */
@Repository
public class AccountRepositoryImp extends CRUDRepositoryImp<AccountEntity,Long> implements AccountRepository{
}
