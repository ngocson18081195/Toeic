package toeic.App.WebServiceImp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toeic.App.DTO.StudentDto;
import toeic.App.Service.CRUDService;
import toeic.App.WebService.CRUDRestImpl;

/**
 * Created by lai on 15/12/2017.
 */
@RestController
@RequestMapping(value = "/Students")
public class StudentWSIpm extends CRUDRestImpl<StudentDto,Long> {
    public StudentWSIpm(CRUDService<StudentDto, Long> crudService) {
        super(crudService);
    }


}
