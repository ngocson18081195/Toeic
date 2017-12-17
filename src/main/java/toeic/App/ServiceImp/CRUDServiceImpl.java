package toeic.App.ServiceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Service.CRUDService;
import toeic.App.Service.ConvertList;
import toeic.App.Transform.Convert;
import toeic.Common.Model.IdModel;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 01/12/2017.
 */
public abstract class CRUDServiceImpl<D, ID extends Serializable, E extends IdModel> implements CRUDService<D, ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDServiceImpl.class);
    protected Convert<E, D> convert;
    protected ConvertList convertList;
    protected CRUDRepository<E, ID> repository;


    public CRUDServiceImpl(Convert<E, D> convert, CRUDRepository<E, ID> repository) {
        this.convert = convert;
        this.repository = repository;
    }

    @Override
    public D findOne(ID id) {
        E e = repository.findOne(id);
        D d = null;
        try {
            d = convert.convertToData(e);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return d;
    }

    @Override
    public D save(D d) throws IOException {
        E e = convert.convertToEntity(d);
        repository.save(e);
        return d;
    }

    @Override
    public void delete(D d) throws IOException {
        E e = convert.convertToEntity(d);
        repository.delete(e);
    }

    @Override
    public D update(D d, ID id) throws IOException {
        E e = convert.convertToEntity(d);
        repository.update(e);
        return d;
    }

    @Override
    public List<D> findAll() throws IOException {
        List<E> dList =  repository.findAll();
        return convert.convertToDatas(dList);
    }

    @Override
    public void delete(ID id) {
        repository.delete(id);
    }

}
