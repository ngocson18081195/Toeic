package toeic.App.WebService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public interface CRUDRest<D, ID extends Serializable> {
    @GetMapping()
    ResponseEntity<List<D>> findAll();

    @GetMapping(value = "/{id}")
    ResponseEntity<D> findOne(@PathVariable(name = "id") ID id);

    @PostMapping()
    ResponseEntity<D> create(D d);

    @PatchMapping(value = "/{id}")
    ResponseEntity<D> update(@PathVariable(name = "id") ID id);

    @DeleteMapping(value = "/{id}")
    HttpStatus remove(@PathVariable(name = "id") ID id);
}
