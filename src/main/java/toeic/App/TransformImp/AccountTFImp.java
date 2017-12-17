package toeic.App.TransformImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.RoleEntity;
import toeic.App.Service.ConvertList;
import toeic.App.Transform.AccountTF;
import toeic.App.Transform.Convert;
import toeic.App.Transform.RoleTF;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lai on 06/12/2017.
 */
@Service
public class AccountTFImp implements AccountTF {
    @Autowired
    AccountTF accountTF;

    @Override
    public AccountEntity convertToEntity(AccountDTO accountDTO) throws IOException {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setEnable(accountDTO.getEnable());
        accountEntity.setEmail(accountDTO.getEmail());
        accountEntity.setPwd(accountDTO.getPwd());
        accountEntity.setId(accountDTO.getId());
//        accountEntity.setRoleEntityList(accountDTO.getRoleList().stream().map(s -> s));
//        accountEntity.setRoleEntityList(accountDTO.);
        return accountEntity;
    }

    @Override
    public AccountDTO convertToData(AccountEntity accountEntity) throws IOException {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setPwd(accountEntity.getPwd());
        accountDTO.setEmail(accountEntity.getEmail());
        accountDTO.setEnable(accountEntity.getEnable());
        accountDTO.setId(accountEntity.getId());
        accountDTO.setRoleList(accountEntity.getRoleEntityList().stream().map(roleEntity -> roleEntity.getName()).collect(Collectors.toList()));
        return accountDTO;
    }

    @Override
    public List<AccountEntity> convertToEntities(List<AccountDTO> accountDTOS) throws IOException {
        List<AccountEntity> accountEntities = new ArrayList<>();
        for (AccountDTO accountDTO:accountDTOS){
            accountEntities.add(accountTF.convertToEntity(accountDTO));
        }
        return accountEntities;
    }

    @Override
    public List<AccountDTO> convertToDatas(List<AccountEntity> accountEntityList) throws IOException {
        List<AccountDTO> accountDTOList = new ArrayList<>();
        for (AccountEntity accountEntity:accountEntityList){
            accountDTOList.add(accountTF.convertToData(accountEntity));
        }
        return null;
    }


}
