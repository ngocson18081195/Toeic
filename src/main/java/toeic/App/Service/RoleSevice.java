package toeic.App.Service;

import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.RoleEntity;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
public interface RoleSevice  {
    List<AccountDTO> getAccountofRole(Long idRole);
}
