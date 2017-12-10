package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.RoleDTO;
import toeic.App.Service.RoleSevice;
import toeic.App.WebService.RoleWS;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 07/12/2017.
 */
@RestController
@RequestMapping(value = "/Role")
public class RoleWSIpm implements RoleWS {

    @Autowired
    RoleSevice roleSevice;

    @Override
    public ResponseEntity<List<RoleDTO>> findAll() throws IOException {
        List<RoleDTO> roleDTOList = roleSevice.list();
        return ResponseEntity.ok(roleDTOList);
    }

    @Override
    public ResponseEntity<RoleDTO> findOne(Long aLong) throws IOException {
        RoleDTO roleDTO = roleSevice.findOne(aLong);
        return ResponseEntity.ok(roleDTO);
    }

    @Override
    public ResponseEntity<RoleDTO> create(RoleDTO roleDTO) throws IOException {
        RoleDTO roleDTONew = roleSevice.save(roleDTO);
        return ResponseEntity.ok(roleDTONew);
    }

    @Override
    public ResponseEntity<RoleDTO> update(RoleDTO roleDTO, Long aLong) throws IOException {
        roleSevice.update(roleDTO,aLong);
        return ResponseEntity.ok(roleDTO);
    }

    @Override
    public HttpStatus remove(Long aLong) throws IOException {
        roleSevice.delete(roleSevice.findOne(aLong));
        return HttpStatus.OK;
    }
}
