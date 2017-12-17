package toeic.App.Service;

import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.AccountEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
public interface AccountSevice  {
    //void addRoleForAccount(String nameRole, Long idAccount);
    List<RoleDTO> getRoleofAccount(Long idAccount);
}
