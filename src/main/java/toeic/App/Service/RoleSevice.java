package toeic.App.Service;

import toeic.App.DTO.RoleDTO;

import java.io.IOException;

/**
 * Created by lai on 06/12/2017.
 */
public interface RoleSevice extends CRUDService<RoleDTO,Long> {
    void update(RoleDTO roleDTO, Long id) throws IOException;
}
