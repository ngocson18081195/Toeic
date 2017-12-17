package toeic.App.Service;

import toeic.App.DTO.StudentDto;
import toeic.App.Entity.Clazz;

import java.util.List;

/**
 * Created by lai on 15/12/2017.
 */
public interface ClazzSevice {

    List<StudentDto> getStudentOfClass(Long idClass);
    boolean addStudentForClass(Long idClass, StudentDto studentDto);
    boolean updateStudentForClass(Long idClass, Long idStudent, StudentDto studentDto);

}
