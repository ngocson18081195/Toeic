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

/**
 * Created by lai on 06/12/2017.
 */
@Service
public class RoleTFImp implements RoleTF {

    //@Autowired
    //AccountTF accountTF;
    ConvertList<AccountEntity,AccountDTO> accountEntityAccountDTOConvertListAccunt;
    @Override
    public RoleEntity convertToEntity(RoleDTO roleDTO) throws IOException {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName(roleDTO.getName());
        roleEntity.setId(roleDTO.getId());
       // roleEntity.setAccountEntityList(accountTF.convertListDTOtoEntity(roleDTO.getAccountDTOList()));
        roleEntity.setAccountEntityList(accountEntityAccountDTOConvertListAccunt.convertToEntities(roleDTO.getAccountDTOList()));
        return roleEntity;
    }



    @Override
    public RoleDTO convertToData(RoleEntity roleEntity) throws IOException {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(roleEntity.getName());
        roleDTO.setId(roleEntity.getId());
        //roleDTO.setAccountDTOList(accountTF.convertListEtntiytoDTO(roleEntity.getAccountEntityList()));
        roleDTO.setAccountDTOList(accountEntityAccountDTOConvertListAccunt.convertToDatas(roleEntity.getAccountEntityList()));
        return roleDTO;
    }




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
