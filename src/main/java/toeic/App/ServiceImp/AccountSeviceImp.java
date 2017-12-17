package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.AccountRepository;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Repository.RoleRepository;
import toeic.App.Service.AccountSevice;
import toeic.App.Service.ConvertList;
import toeic.App.Transform.AccountTF;
import toeic.App.Transform.Convert;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lai on 06/12/2017.
 */
@Service
@Transactional
public class AccountSeviceImp extends CRUDServiceImpl<AccountDTO,Long,AccountEntity> implements AccountSevice {


    public AccountSeviceImp(Convert<AccountEntity, AccountDTO> convert, CRUDRepository<AccountEntity, Long> repository) {
        super(convert, repository);
    }

    @Override
    public List<RoleDTO> getRoleofAccount(Long idAccount) {
        AccountEntity accountEntity = repository.findOne(idAccount);
        return accountEntity.getRoleEntityList().stream().map(roleEntity ->{
            RoleDTO roleDTO = new RoleDTO();
            roleDTO.setName(roleEntity.getName());
            return  roleDTO;
        }).collect(Collectors.toList());
    }
}

