package toeic.App.WebService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public interface CRUDRest<E, ID extends Serializable> {
    @GetMapping()
    ResponseEntity<List<E>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<E> findOne(@PathVariable(name = "id") ID id);

    @PostMapping()
    ResponseEntity<E> create();

    @PatchMapping(value = "/{id}")
    ResponseEntity<E> update(@PathVariable(name = "id") ID id);

    @DeleteMapping(value = "/{id}")
    HttpStatus remove(@PathVariable(name = "id") ID id);
}
