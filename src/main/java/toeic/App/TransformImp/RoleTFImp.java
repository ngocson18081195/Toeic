package toeic.App.TransformImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.RoleEntity;
import toeic.App.Service.ConvertList;
import toeic.App.Transform.AccountTF;
import toeic.App.Transform.RoleTF;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lai on 06/12/2017.
 */
@Service
public class RoleTFImp implements RoleTF {
//    ConvertList convertList;
//    AccountTF accountTF;
//
//    @Autowired
//    public RoleTFImp(ConvertList convertList, AccountTF accountTF) {
//        this.convertList = convertList;
//        this.accountTF = accountTF;
//    }
    @Override
    public RoleEntity convertToEntity(RoleDTO roleDTO) throws IOException {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(roleDTO.getId());
        roleEntity.setName(roleDTO.getName());
        return roleEntity;
//        return roleEntity;
      //  return null;
    }
    @Override
    public RoleDTO convertToData(RoleEntity roleEntity) throws IOException {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(roleEntity.getName());
        roleDTO.setAccountList(roleEntity.getAccountEntityList().stream()
        .map(accountEntity -> {
            return accountEntity.getEmail();
        }).collect(Collectors.toList()));
        return roleDTO;
    }

    @Override
    public List<RoleEntity> convertToEntities(List<RoleDTO> roleDTOS) throws IOException {
        return null;
    }

    @Override
    public List<RoleDTO> convertToDatas(List<RoleEntity> roleEntities) throws IOException {
        return null;
    }
    //@Autowired
    //AccountTF accountTF;
    // ConvertList<AccountEntity,AccountDTO> accountEntityAccountDTOConvertListAccunt;
//    AccountTF accountTF;
//    ConvertList convertList;
//
//    @Autowired
//    public RoleTFImp(AccountTF accountTF, ConvertList convertList) {
//        this.accountTF = accountTF;
//        this.convertList = convertList;
//    }
//
//    @Override
//    public RoleEntity convertToEntity(RoleDTO roleDTO) throws IOException {
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setName(roleDTO.getName());
//        roleEntity.setId(roleDTO.getId());
//        roleEntity.setAccountEntityList(convertList.convertToEntities(accountTF, roleDTO.getAccountDTOList()));
//        return roleEntity;
//    }
//
//
//    @Override
//    public RoleDTO convertToData(RoleEntity roleEntity) throws IOException {
//        RoleDTO roleDTO = new RoleDTO();
//        roleDTO.setName(roleEntity.getName());
//        roleDTO.setId(roleEntity.getId());
//        roleDTO.setAccountDTOList(convertList.convertToDatas(accountTF, roleEntity.getAccountEntityList()));
//        return roleDTO;
//    }


//    @Override
//    public List<RoleDTO> convertListEtntiytoDTO(List<RoleEntity> roleEntityList) throws IOException {
//        List<RoleDTO> roleDTOList = new ArrayList<>();
//        for(RoleEntity roleEntity:roleEntityList){
//            RoleDTO roleDTO = this.convertToData(roleEntity);
//            roleDTOList.add(roleDTO);
//        }
//        return roleDTOList;
//    }
//
//    @Override
//    public List<RoleEntity> convertListDTOtoEntity(List<RoleDTO> roleDTOList) throws IOException {
//        List<RoleEntity> roleEntityList = new ArrayList<>();
//        for(RoleDTO roleDTO:roleDTOList){
//            RoleEntity roleEntity = this.convertToEntity(roleDTO);
//            roleEntityList.add(roleEntity);
//        }
//        return roleEntityList;
//    }
}
