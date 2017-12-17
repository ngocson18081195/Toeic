package toeic.App.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Repository.RoleRepository;
import toeic.App.Service.ConvertList;
import toeic.App.Service.RoleSevice;
import toeic.App.Transform.Convert;
import toeic.App.Transform.RoleTF;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lai on 06/12/2017.
 */
@Service
@Transactional
public class RoleSeviceImp extends CRUDServiceImpl<RoleDTO,Long,RoleEntity> implements RoleSevice{
    public RoleSeviceImp(Convert<RoleEntity, RoleDTO> convert, CRUDRepository<RoleEntity, Long> repository) {
        super(convert, repository);
    }

    @Override
    public List<AccountDTO> getAccountofRole(Long idRole) {
        RoleEntity roleEntity = repository.findOne(idRole);

        return roleEntity.getAccountEntityList().stream().map(accountEntity -> {
            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setEmail(accountEntity.getEmail());
            return accountDTO;
        }).collect(Collectors.toList());
    }
}
