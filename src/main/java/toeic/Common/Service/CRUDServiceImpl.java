package toeic.Common.Service;

import toeic.Common.Model.IdModel;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by chien on 17/11/2017.
 */
public abstract class CRUDServiceImpl<E extends IdModel,
        ID extends Serializable,
        R extends CrudRepository<E, ID>> implements CRUDService<E, ID> {

    protected R repository;

    public CRUDServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E findOne(ID id) {
        return repository.findOne(id);
    }

    @Override
    public E save(E e) {
        return repository.save(e);
    }

}
