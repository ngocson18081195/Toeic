package toeic.App.Service;

import toeic.Common.Model.IdModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 17/11/2017.
 */
public interface CRUDService<E extends IdModel, ID extends Serializable>{

    E findOne(ID id);

    E save(E e);

    void delete(ID id);

    List<E> list();
}
