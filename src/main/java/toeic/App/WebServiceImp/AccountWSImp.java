package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.AccountDTO;
import toeic.App.DTO.RoleDTO;
import toeic.App.Repository.AccountRepository;
import toeic.App.Repository.RoleRepository;
import toeic.App.Service.AccountSevice;
import toeic.App.Service.RoleSevice;
import toeic.App.Transform.RoleTF;
import toeic.App.WebService.AccountWS;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 06/12/2017.
 */
@RestController
@RequestMapping(value = "/Account")
public class AccountWSImp implements AccountWS {

    @Autowired
    AccountSevice accountSevice;
    @Autowired
    RoleSevice roleSevice;
    @Autowired
    RoleTF roleTF;
    @Autowired
    RoleRepository roleRepository;

    @Override
    public ResponseEntity<List<AccountDTO>> findAll() throws IOException {
        List<AccountDTO> accountDTOList = accountSevice.list();
        return ResponseEntity.ok(accountDTOList);
    }

    @Override
    public ResponseEntity<AccountDTO> findOne(Long aLong) throws IOException {
        AccountDTO accountDTO =  accountSevice.findOne(aLong);
        return ResponseEntity.ok(accountDTO);
    }

    @Override
    public ResponseEntity<AccountDTO> create(AccountDTO accountDTO) throws IOException {
        for(RoleDTO roleDTO:roleSevice.list()){
            if(roleDTO.getName().equalsIgnoreCase("q") || roleDTO.getName().equalsIgnoreCase("a")){
             //   accountDTO.getRoleDTOArrayList().add(roleDTO);
                accountDTO.getRoleDTOArrayList().add(roleDTO);
                System.out.println("so ket qua ===+++++++"+roleDTO.getName());
                System.out.println("so ket qua ===+++++++"+roleDTO.getAccountDTOList());
                System.out.println("so ket qua ===+++++++"+roleDTO.getId());
            }

        }
        accountSevice.save(accountDTO);
        return ResponseEntity.ok(accountDTO);

    }

    @Override
    public ResponseEntity<AccountDTO> update(AccountDTO accountDTO, Long aLong) throws IOException {

        accountSevice.update(accountDTO,aLong);
        return ResponseEntity.ok(accountDTO);
    }

    @Override
    public HttpStatus remove(Long aLong) throws IOException {
        AccountDTO accountDTO = accountSevice.findOne(aLong);
        accountSevice.delete(accountDTO);
        return HttpStatus.OK;
    }
}
