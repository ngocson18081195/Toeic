package toeic.App.Service;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 17/11/2017.
 */
public interface CRUDService<E, ID extends Serializable> {

    E findOne(ID id) throws IOException;

    E save(E e) throws IOException;

    void delete(E e) throws IOException;

    List<E> list() throws IOException;

}
