package toeic.App.ServiceImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.StudentDto;
import toeic.App.Entity.Student;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Repository.StudentDao;
import toeic.App.Service.StudentSevice;
import toeic.App.Transform.Convert;

import javax.transaction.Transactional;

/**
 * Created by lai on 15/12/2017.
 */
@Service
@Transactional
public class StudentSeviceIpm extends CRUDServiceImpl<StudentDto,Long,Student> implements StudentSevice{


    public StudentSeviceIpm(Convert<Student, StudentDto> convert, CRUDRepository<Student, Long> repository) {
        super(convert, repository);
    }



}
