package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.DTO.RoleDTO;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.RoleRepository;

/**
 * Created by lai on 06/12/2017.
 */
@Repository
public class RoleRepositoryImp extends CRUDRepositoryImp<RoleEntity,Long> implements RoleRepository {
}
