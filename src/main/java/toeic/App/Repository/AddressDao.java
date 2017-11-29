package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.AddressEntity;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public interface AddressDao extends CRUDRepository<AddressEntity,Integer> {
    AddressEntity createAddress(AddressEntity addressEntity);
}
