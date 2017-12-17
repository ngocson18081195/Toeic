package toeic.App.WebService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chien on 29/11/2017.
 */
public interface CRUDRest<D, ID extends Serializable> {

    @GetMapping(value = "/{id}")
    ResponseEntity<D> findOne(@PathVariable(name = "id") ID id) throws IOException;

    @GetMapping()
    ResponseEntity<List<D>> findAll() throws IOException;
    @PutMapping(value = "/{id}")
    ResponseEntity<D> update(D d, @PathVariable(name = "id") ID id) throws IOException;

    @DeleteMapping(value = "/{id}")
    HttpStatus remove(@PathVariable(name = "id") ID id) throws IOException;
    @PostMapping()
    ResponseEntity<D> create(@RequestBody D d);
}
