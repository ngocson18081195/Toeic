package toeic.App.WebService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ngocson on 29/11/2017.
 */
@RestController
public interface CandidateWS {
    @RequestMapping(value = "/candidate")
    ResponseEntity save();
    @RequestMapping(value = "/candidatelist")
    ResponseEntity list();
}
