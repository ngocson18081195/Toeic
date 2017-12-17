package toeic.App.WebServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toeic.App.DTO.ClazzDto;
import toeic.App.DTO.StudentDto;
import toeic.App.Service.CRUDService;
import toeic.App.Service.ClazzSevice;
import toeic.App.WebService.CRUDRestImpl;

/**
 * Created by lai on 15/12/2017.
 */
@RestController
@RequestMapping(value = "/clazzs")
public class ClazzWSIpm extends CRUDRestImpl<ClazzDto, Long> {


    private ClazzSevice clazzSevice;

    @Autowired
    public ClazzWSIpm(CRUDService<ClazzDto, Long> crudService, ClazzSevice clazzSevice) {
        super(crudService);
        this.clazzSevice = clazzSevice;
    }

    @GetMapping("/{idClass}/students")
    public ResponseEntity getStudentOfClass(@PathVariable(name = "idClass") Long idClass) {
        return ResponseEntity.ok(this.clazzSevice.getStudentOfClass(idClass));
    }
    @PostMapping("/{idClass}/students")
    public ResponseEntity addStudentForClass(@PathVariable(name = "idClass") Long idClass,
                                             @RequestBody() StudentDto studentDto) {
        return ResponseEntity.ok(this.clazzSevice.addStudentForClass(idClass, studentDto));
    }
    @PutMapping("/{idClass}/students/{idStudent}")
    public ResponseEntity updateStudentForClass(@PathVariable(name = "idClass") Long idClass,
                                                @PathVariable(name = "idStudent") Long idStudent,
                                                @RequestBody() StudentDto studentDto) {
        return ResponseEntity.ok(this.clazzSevice.updateStudentForClass(idClass, idStudent, studentDto));
    }

}
