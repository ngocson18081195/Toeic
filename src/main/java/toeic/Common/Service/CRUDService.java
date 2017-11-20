package toeic.Common.Service;

import toeic.Common.Model.IdModel;

import java.io.Serializable;

/**
 * Created by chien on 17/11/2017.
 */
public interface CRUDService<E extends IdModel, ID extends Serializable> extends RootService {

    E findOne(ID id);

    E save(E e);

}
