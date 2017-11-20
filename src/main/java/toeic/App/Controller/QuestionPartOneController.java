package toeic.App.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by chien on 19/11/2017.
 */
@Controller
public class QuestionPartOneController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
