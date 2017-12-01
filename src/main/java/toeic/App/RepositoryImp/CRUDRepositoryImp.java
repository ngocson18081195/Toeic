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
public class CRUDRepositoryImp<E extends IdModel, ID extends Serializable> implements CRUDRepository<E, ID> {
    /**
     * create Entity manager
     */
    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<E> entityClass;

    public CRUDRepositoryImp() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) parameterizedType.getActualTypeArguments()[0];
    }

    /**
     * Method find one Entity
     *
     * @param id
     * @return EntityManager
     */
    @Override
    public E findOne(ID id) {
        E e = entityManager.find(entityClass, id);
        return e;
    }

    /**
     * Method Save Entity into Database
     *
     * @param e
     * @return EntityManager
     */
    @Override
    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    /**
     * Method delete Entity from database
     *
     * @param id
     */
    @Override
    public void delete(ID id) {
        entityManager.remove(id);
    }

    @Override
    public List<E> findAll() {
        List<E> list = entityManager.createQuery("from " + entityClass.getName()).getResultList();
        return list;
    }

    @Override
    public E update(E e) {
        return null;
    }
}
