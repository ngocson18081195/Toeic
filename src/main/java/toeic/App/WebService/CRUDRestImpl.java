package toeic.App.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import toeic.App.DTO.Dto;
import toeic.App.Service.CRUDService;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public abstract class CRUDRestImpl<D extends Dto, ID extends Serializable> implements CRUDRest<D, ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDRestImpl.class);
    protected CRUDService<D, ID> crudService;

    public CRUDRestImpl(CRUDService<D, ID> crudService) {
        this.crudService = crudService;
    }

    @Override
    public ResponseEntity<List<D>> findAll() throws IOException {
        List<D> list = crudService.findAll();
        return ResponseEntity.ok(list);
    }

    @Override
    public ResponseEntity<D> findOne(@PathVariable(name = "id") ID id) throws IOException {
        D d = crudService.findOne(id);
        return ResponseEntity.ok(d);
    }

    @Override
    public ResponseEntity<D> create(@RequestBody D d){
//        crudService.save(d);
        return ResponseEntity.ok(d);
    }

    @Override
    public ResponseEntity<D> update(D d, @PathVariable(name = "id") ID id) throws IOException {
        crudService.update(d, id);
        return ResponseEntity.ok(d);
    }

    @Override
    public HttpStatus remove(@PathVariable(name = "id") ID id) {
        crudService.delete(id);
        return HttpStatus.OK;
    }

}
