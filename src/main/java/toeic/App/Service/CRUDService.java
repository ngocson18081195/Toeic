package toeic.App.Service;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 17/11/2017.
 */
public interface CRUDService<D, ID extends Serializable> {

   // List<D> list() throws IOException;

    D findOne(ID id) throws IOException;

    D save(D d) throws IOException;

    void delete(D d) throws IOException;

    D update(D d, ID id) throws IOException;

    List<D> findAll() throws IOException;

    void delete(ID id);


}
