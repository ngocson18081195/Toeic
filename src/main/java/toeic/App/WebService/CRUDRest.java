package toeic.App.WebService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public interface CRUDRest<E, ID extends Serializable> {
    @GetMapping( value = "/all")
    ResponseEntity<List<E>> findAll() throws IOException;

    @GetMapping(value = "/{id}")
    ResponseEntity<E> findOne(@PathVariable(name = "id") ID id) throws IOException;

    @PostMapping(value = "/save" )
    ResponseEntity<E> create(@RequestBody E e) throws IOException;

    @PutMapping(value = "/{id}")
    ResponseEntity<E> update(@RequestBody E e,@PathVariable(name = "id") ID id) throws IOException;

    @DeleteMapping(value = "/{id}")
    HttpStatus remove(@PathVariable(name = "id") ID id) throws IOException;
}
