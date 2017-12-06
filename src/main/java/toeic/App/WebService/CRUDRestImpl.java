package toeic.App.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import toeic.App.Service.CRUDService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public abstract class CRUDRestImpl<D, ID extends Serializable> implements CRUDRest<D, ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDRestImpl.class);
    protected CRUDService<D, ID> crudService;

    public CRUDRestImpl(CRUDService<D, ID> crudService) {
        this.crudService = crudService;
    }

    @Override
    public ResponseEntity<List<D>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<D> findOne(@PathVariable(name = "id") ID id) {
        return null;
    }

    @Override
    public ResponseEntity<D> create(D d) {
        crudService.save(d);
        return null;
    }

    @Override
    public ResponseEntity<D> update(@PathVariable(name = "id") ID id) {
        return null;
    }

    @Override
    public HttpStatus remove(@PathVariable(name = "id") ID id) {
        return null;
    }

}
