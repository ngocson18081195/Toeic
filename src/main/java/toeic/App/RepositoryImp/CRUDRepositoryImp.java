package toeic.App.RepositoryImp;

import org.springframework.transaction.annotation.Transactional;
import toeic.App.Repository.CRUDRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by ngocson on 24/11/2017.
 */
public class CRUDRepositoryImp<E, ID extends Serializable> implements CRUDRepository<E,ID> {
    /**
     *  create Entity manager
     *
     */
    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<E> entityClass;

    /**
     *
     */
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
        E e = entityManager.find(entityClass,id);
        return e;
    }

    /**
     * Method Save Entity into Database
     * @param e
     * @return EntityManager
     */
    @Transactional
    @Override
    public E save(E e) {
        entityManager.persist(e);
        return e;
    }

    /**
     * Method delete Entity from database
     *
     * @param e
     */
    @Override
    public void delete(E e) {
        System.out.println("@@@@@@"+e);
        entityManager.remove(e);
    }

    /**
     *  Method list entity
     *
     * @return List Entity
     */
    @Override
    public List<E> findAll() {
        List<E> list = entityManager.createQuery("from "+ entityClass.getName()).getResultList();
        return list;
    }

    /**
     * Method Update entity
     * @param e
     * @return Entity
     */
    @Override
    public E update(E e) {

        return entityManager.merge(e);
    }
}
