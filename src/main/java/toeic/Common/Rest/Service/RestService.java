package toeic.Common.Rest.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toeic.Common.Model.IdModel;

import java.io.Serializable;

/**
 * Created by ngocson on 20/11/2017.
 */
public interface RestService<E extends IdModel, ID extends Serializable> {

    @GetMapping(value = "/save")
    ResponseEntity save(E e);

    @PutMapping(value = "/{id}")
    ResponseEntity update(@PathVariable(name = "id") ID id);

    @DeleteMapping(value = "/{id}")
    ResponseEntity delete(@PathVariable(name = "id") ID id);

}
