package toeic.App.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public abstract class CRUDRestImpl<E, ID extends Serializable> implements CRUDRest<E, ID> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CRUDRestImpl.class);


    @Override
    public ResponseEntity<List<E>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<E> findOne(@PathVariable(name = "id") ID id) {
        return null;
    }

    @Override
    public ResponseEntity<E> create(@RequestBody E e) {
        return null;
    }

    @Override
    public ResponseEntity<E> update(@RequestBody E e,@PathVariable(name = "id") ID id) {
        return null;
    }

    @Override
    public HttpStatus remove(@PathVariable(name = "id") ID id) {
        return null;
    }

}
