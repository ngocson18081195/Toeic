package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toeic.App.DTO.RoleDTO;
import toeic.App.Service.CRUDService;
import toeic.App.Service.RoleSevice;
import toeic.App.WebService.CRUDRestImpl;
import toeic.App.WebService.RoleWS;

/**
 * Created by lai on 07/12/2017.
 */
@RestController
@RequestMapping(value = "/roles")
public class RoleWSIpm extends CRUDRestImpl<RoleDTO,Long> implements RoleWS{

    public RoleWSIpm(CRUDService<RoleDTO, Long> crudService) {
        super(crudService);
    }
    @Autowired
    RoleSevice roleSevice;
    @GetMapping("/{idRole}/accounts")
    public ResponseEntity getAccountofRole(@PathVariable( name = "idRole")Long idRole){
       System.out.print("llllllllllllllllllllllllllllllllllllllllllllllll");
        return ResponseEntity.ok(roleSevice.getAccountofRole(idRole));
    }
}
