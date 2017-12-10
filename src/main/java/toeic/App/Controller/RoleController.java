package toeic.App.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import toeic.App.DTO.RoleDTO;

/**
 * Created by lai on 07/12/2017.
 */
@Controller
public class RoleController {
    @RequestMapping("/createRole")
    private String create(Model model){
        model.addAttribute("Role", new RoleDTO());
        return "CreateRole";
    }
}
