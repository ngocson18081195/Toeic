package toeic.App.WebService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by ngocson on 24/11/2017.
 */
public interface PartOneWS {
    @RequestMapping(value = "/save")
    ResponseEntity create() throws IOException;

    @RequestMapping(value = "/list")
    ResponseEntity findAll() throws IOException;

    @RequestMapping(value = "/find/{id}")
    ResponseEntity findOne(@PathVariable(name = "id") Long id) throws IOException;

    @RequestMapping(value = "/delete/{id}")
    ResponseEntity delete(@PathVariable(name = "id")Long id) throws IOException;
}
