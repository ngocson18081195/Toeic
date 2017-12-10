package toeic.App.WebService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ngocson on 24/11/2017.
 */
public interface PartOneWS {
    @RequestMapping(value = "/save")
    ResponseEntity create();

    @RequestMapping(value = "/list")
    ResponseEntity findAll();

    @RequestMapping(value = "/find/{id}")
    ResponseEntity findOne(@PathVariable(name = "id") Long id);

    @RequestMapping(value = "/delete/{id}")
    ResponseEntity delete(@PathVariable(name = "id")Long id);
}
