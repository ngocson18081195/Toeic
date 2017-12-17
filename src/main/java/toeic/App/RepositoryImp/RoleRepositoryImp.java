package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.RoleEntity;
import toeic.App.Repository.RoleRepository;

import javax.persistence.Query;

/**
 * Created by lai on 06/12/2017.
 */
@Repository
public class RoleRepositoryImp extends CRUDRepositoryImp<RoleEntity, Long> implements RoleRepository {
    @Override
    public RoleEntity findByName(String nameRole) {
        String stringQuery = "select r from "
                + RoleEntity.class.getSimpleName()
                + " as r where r.name =:name";
        Query query = this.entityManager.createQuery(stringQuery);
        query.setParameter("name", nameRole);
        return (RoleEntity) query.getResultList().get(0);
    }
}
