package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.AccountRepository;
import toeic.App.Service.AccountSevice;
import toeic.App.Transform.AccountTF;
import toeic.App.Transform.RoleTF;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Service
@Transactional
public class AccountSeviceImp implements AccountSevice  {


    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountTF accountTF;


    @Override
    public AccountDTO findOne(Long aLong) throws IOException {

        AccountEntity accountEntity = accountRepository.findOne(aLong);
        AccountDTO accountDTO = accountTF.convertToData(accountEntity);
        return accountDTO;
    }

    @Override
    public AccountDTO save(AccountDTO accountDTO) throws IOException {

        AccountEntity accountEntity = accountTF.convertToEntity(accountDTO);
        accountRepository.save(accountEntity);
        return accountDTO;
    }

    @Override
    public void delete(AccountDTO accountDTO) throws IOException{
        AccountEntity accountEntity = accountTF.convertToEntity(accountDTO);
        accountRepository.delete(accountEntity);

    }

    @Override
    public List<AccountDTO> list() throws IOException {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        List<AccountDTO> accountDTOS = accountTF.convertListEtntiytoDTO(accountEntities);
        return accountDTOS;
    }

    @Override
    public void update(AccountDTO accountDTO,Long id) throws IOException {


        AccountDTO accountDTOupdate = this.findOne(id);

        accountDTOupdate.setRoleDTOArrayList(accountDTO.getRoleDTOArrayList());
        accountDTOupdate.setEnable(accountDTO.getEnable());
        accountDTOupdate.setEmail(accountDTO.getEmail());
        accountDTOupdate.setPwd(accountDTO.getPwd());

        AccountEntity accountEntity = accountTF.convertToEntity(accountDTOupdate);

        accountRepository.update(accountEntity);
    }
}
