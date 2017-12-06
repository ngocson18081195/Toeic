package toeic.App.ServiceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Service.CRUDService;
import toeic.App.Transform.Convert;
import toeic.Common.Model.IdModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 01/12/2017.
 */
public abstract class CRUDServiceImpl<D, ID extends Serializable, E extends IdModel> implements CRUDService<D, ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDServiceImpl.class);
    protected Convert<E, D> convert;
    protected CRUDRepository<E, ID> repository;

    public CRUDServiceImpl(Convert<E, D> convert, CRUDRepository<E, ID> repository) {
        this.convert = convert;
        this.repository = repository;
    }

    @Override
    public D findOne(ID id) {
        return null;
    }

    @Override
    public D save(D d) {
        LOGGER.info("Save");
        E e = convert.convertToEntity(d);
        LOGGER.info("Convert Success, Go To Database");
        repository.save(e);
        return d;
    }

    @Override
    public void delete(D d) {

    }

    @Override
    public List<D> list() {
        return null;
    }

}
