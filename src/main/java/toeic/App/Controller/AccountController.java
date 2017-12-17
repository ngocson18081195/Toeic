package toeic.App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import toeic.App.DTO.AccountDTO;
import toeic.App.Entity.AccountEntity;
import toeic.App.Service.RoleSevice;

import java.io.IOException;


/**
 * Created by lai on 06/12/2017.
 */
@Controller
public class AccountController {
//    @Autowired
//    RoleSevice roleSevice;
    @RequestMapping("/createAcount")
    private String createAcount(Model model) throws IOException {
        model.addAttribute("Account",new AccountDTO());
        return "CreateAccount";
    }
}
