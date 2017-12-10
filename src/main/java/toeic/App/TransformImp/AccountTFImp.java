package toeic.App.TransformImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Transform.AccountTF;
import toeic.App.Transform.RoleTF;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Service
public class AccountTFImp implements AccountTF {
    @Autowired
    RoleTF roleTF;
    @Override
    public AccountEntity convertToEntity(AccountDTO accountDTO) throws IOException {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setEnable(accountDTO.getEnable());
        accountEntity.setEmail(accountDTO.getEmail());
        accountEntity.setPwd(accountDTO.getPwd());
        accountEntity.setRoleEntityList(roleTF.convertListDTOtoEntity(accountDTO.getRoleDTOArrayList()));
        return accountEntity;
    }

    @Override
    public AccountDTO convertToData(AccountEntity accountEntity) throws IOException {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setPwd(accountEntity.getPwd());
        accountDTO.setEmail(accountEntity.getEmail());
        accountDTO.setEnable(accountEntity.getEnable());
        accountDTO.setRoleDTOArrayList(roleTF.convertListEtntiytoDTO(accountEntity.getRoleEntityList()));

        return accountDTO;
    }

    @Override
    public List<AccountDTO> convertListEtntiytoDTO(List<AccountEntity> accountEntityList) throws IOException {
        List<AccountDTO> accountDTOList = new ArrayList<>();
        for(AccountEntity accountEntity :accountEntityList ){

            AccountDTO  accountDTO = this.convertToData(accountEntity);
            accountDTOList.add(accountDTO);

        }
        return accountDTOList;
    }

    @Override
    public List<AccountEntity> convertListDTOtoEntity(List<AccountDTO> accountDTOList) throws IOException {
        List<AccountEntity> accountEntityList = new ArrayList<>();
        for(AccountDTO accountDTO :accountDTOList){

            AccountEntity accountEntity = this.convertToEntity(accountDTO);
            accountEntityList.add(accountEntity);

        }
        return accountEntityList;
    }
}
