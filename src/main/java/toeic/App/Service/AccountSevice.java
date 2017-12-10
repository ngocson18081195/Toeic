package toeic.App.Service;

import toeic.App.DTO.AccountDTO;
import toeic.App.Entity.AccountEntity;

import java.io.IOException;

/**
 * Created by lai on 06/12/2017.
 */
public interface AccountSevice extends CRUDService<AccountDTO,Long> {
    void update(AccountDTO accountDTO, Long id) throws IOException;
}
