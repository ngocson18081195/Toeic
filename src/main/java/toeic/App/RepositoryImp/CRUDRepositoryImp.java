package toeic.App.RepositoryImp;

import toeic.App.Repository.CRUDRepository;
import toeic.Common.Model.IdModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
public class CRUDRepositoryImp<E extends IdModel, ID extends Serializable> implements CRUDRepository<E,ID> {
    /**
     *  create Entity manager
     *
     */
    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<E> entityclass;

    public CRUDRepositoryImp() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityclass = (Class<E>) parameterizedType.getActualTypeArguments()[0];
    }

    @Override
    public E findOne(ID id) {
        return null;
    }

    @Override
    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public List<E> findAll() {
        List<E> list = entityManager.createQuery("from "+entityclass.getName()).getResultList();
        return list;
    }
}
