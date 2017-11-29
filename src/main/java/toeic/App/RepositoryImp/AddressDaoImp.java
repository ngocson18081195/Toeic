package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.AddressEntity;
import toeic.App.Repository.AddressDao;

/**
 * Created by ngocson on 29/11/2017.
 */
@Repository
public class AddressDaoImp extends CRUDRepositoryImp<AddressEntity,Integer> implements AddressDao {
    @Override
    public AddressEntity createAddress(AddressEntity addressEntity) {
        return this.save(addressEntity);
    }
}
