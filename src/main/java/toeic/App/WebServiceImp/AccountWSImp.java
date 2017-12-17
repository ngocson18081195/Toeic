package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Service.AccountSevice;
import toeic.App.Service.CRUDService;
import toeic.App.WebService.AccountWS;
import toeic.App.WebService.CRUDRestImpl;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@RestController
@RequestMapping(value = "/accounts")
public class AccountWSImp extends CRUDRestImpl<AccountDTO, Long> implements AccountWS {

    public AccountWSImp(CRUDService<AccountDTO, Long> crudService) {
        super(crudService);
    }
    @Autowired
    AccountSevice accountSevice;

    @GetMapping("/{idAccount}/roles")
    public ResponseEntity getRoleofAccount(@PathVariable(name = "idAccount") Long idAccount){

        return ResponseEntity.ok(this.accountSevice.getRoleofAccount(idAccount));

    }

}
