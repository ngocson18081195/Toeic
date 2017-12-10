package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.RoleRepository;
import toeic.App.Service.RoleSevice;
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
public class RoleSeviceImp implements RoleSevice {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    RoleTF roleTF;


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
    public List<RoleDTO> list() throws IOException {
        List<RoleEntity> roleEntityList = roleRepository.findAll();
        List<RoleDTO> roleDTOList = roleTF.convertListEtntiytoDTO(roleEntityList);
        return roleDTOList;
    }


    @Override
    public void update(RoleDTO roleDTO, Long id) throws IOException {


        RoleDTO roleDTOUpdate = new RoleDTO();
        roleDTOUpdate.setName(roleDTO.getName());
        roleDTOUpdate.setAccountDTOList(roleDTO.getAccountDTOList());
        RoleEntity roleEntity = roleTF.convertToEntity(roleDTOUpdate);
        roleRepository.update(roleEntity);

    }
}
