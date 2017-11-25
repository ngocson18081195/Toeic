package toeic.App.Repository;

import org.springframework.stereotype.Repository;
import toeic.Common.Model.IdModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
@Repository
public interface CRUDRepository<E extends IdModel, ID extends Serializable> {
    E findOne(ID id);

    E save(E e);

    void delete(ID id);

    List<E> findAll();

    E update(E e);
}
