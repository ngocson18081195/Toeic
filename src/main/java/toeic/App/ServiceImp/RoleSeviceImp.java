package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.RoleRepository;
import toeic.App.Service.RoleSevice;
import toeic.App.Transform.RoleTF;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@Service
@Transactional
public class RoleSeviceImp implements RoleSevice {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    RoleTF roleTF;
    ConvertListIpm<RoleEntity,RoleDTO> convertList;

    @Override
    public RoleDTO findOne(Long aLong) throws IOException {
        RoleEntity roleEntity = roleRepository.findOne(aLong);
        RoleDTO roleDTO = roleTF.convertToData(roleEntity);
        return roleDTO;
    }

    @Override
    public RoleDTO save(RoleDTO roleDTO) throws IOException {
        RoleEntity roleEntity = roleTF.convertToEntity(roleDTO);
        roleRepository.save(roleEntity);
        return roleDTO;
    }

    @Override
    public void delete(RoleDTO roleDTO) throws IOException {

        RoleEntity roleEntity = roleTF.convertToEntity(roleDTO);
        roleRepository.delete(roleEntity);

    }

    @Override
    public RoleDTO update(RoleDTO roleDTO, Long id) throws IOException {


        RoleDTO roleDTOUpdate = new RoleDTO();
        roleDTOUpdate.setName(roleDTO.getName());
        roleDTOUpdate.setAccountDTOList(roleDTO.getAccountDTOList());
        RoleEntity roleEntity = roleTF.convertToEntity(roleDTOUpdate);
        roleRepository.update(roleEntity);


        return roleDTOUpdate;
    }

    @Override
    public List<RoleDTO> findAll() throws IOException {
        List<RoleEntity> roleEntityList = roleRepository.findAll();
        List<RoleDTO> roleDTOList = convertList.convertToDatas(roleEntityList);
        return roleDTOList;
    }

    @Override
    public void delete(Long aLong) {
        roleRepository.delete(aLong);
    }


    /**
     * Version 1
     */
    @Override
    public List<RoleEntity> convertToRoleEntityList(List<RoleDTO> roleDtoList) throws IOException {
        List<RoleEntity> roleEntityList = new ArrayList<>(0);
        for (RoleDTO roleDTO : roleDtoList) {
            roleEntityList.add(this.roleTF.convertToEntity(roleDTO));
        }
        return roleEntityList;
    }

}
