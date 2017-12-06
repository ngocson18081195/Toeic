package toeic.App.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 17/11/2017.
 */
public interface CRUDService<D, ID extends Serializable> {

    D findOne(ID id);

    D save(D d);

    void delete(D d);

    List<D> list();

}
