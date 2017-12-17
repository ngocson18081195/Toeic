package toeic.App.ServiceImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.ClazzDto;
import toeic.App.DTO.StudentDto;
import toeic.App.Entity.Clazz;
import toeic.App.Entity.Student;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Service.ClazzSevice;
import toeic.App.Transform.Convert;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lai on 15/12/2017.
 */
@Service
@Transactional
public class ClazzSeviceIpm extends CRUDServiceImpl<ClazzDto,Long,Clazz> implements ClazzSevice {

    public ClazzSeviceIpm(Convert<Clazz, ClazzDto> convert, CRUDRepository<Clazz, Long> repository) {
        super(convert, repository);
    }

    @Override
    public List<StudentDto> getStudentOfClass(Long idClass) {
        Clazz clazz = this.repository.findOne(idClass);
        System.out.println(clazz.getStudents().size());
        return clazz.getStudents().stream().map(student -> {
            StudentDto studentDto = new StudentDto();
            studentDto.setName(student.getName());
            return studentDto;
        }).collect(Collectors.toList());
    }

    @Override
    public boolean addStudentForClass(Long idClass, StudentDto studentDto) {
        Clazz clazz = this.repository.findOne(idClass);
        Student student = new Student();
        System.out.println(studentDto.getName());
        student.setName(studentDto.getName());
        student.setClazz(clazz);
        clazz.getStudents().add(student);
        System.out.println(clazz.getStudents().size());
        repository.update(clazz);
        return false;
    }

    @Override
    public boolean updateStudentForClass(Long idClass, Long idStudent, StudentDto studentDto) {
        Clazz clazz = this.repository.findOne(idClass);
        for (Student student : clazz.getStudents()) {
            if (idStudent == student.getId()) {
                student.setName(studentDto.getName());
            }
            break;
        }
        this.repository.update(clazz);
        return false;
    }

}
