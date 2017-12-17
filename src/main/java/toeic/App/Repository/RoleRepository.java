package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.RoleEntity;

/**
 * Created by lai on 06/12/2017.
 */
@Repository
public interface RoleRepository extends CRUDRepository<RoleEntity,Long>{
    RoleEntity findByName(String nameRole);
}
