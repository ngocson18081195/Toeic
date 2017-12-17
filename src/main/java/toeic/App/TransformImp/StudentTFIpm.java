package toeic.App.TransformImp;

import org.springframework.stereotype.Service;
import toeic.App.DTO.StudentDto;
import toeic.App.Entity.Student;
import toeic.App.Transform.StudentTF;

import java.io.IOException;
import java.util.List;

/**
 * Created by lai on 15/12/2017.
 */
@Service
public class StudentTFIpm implements StudentTF {
    @Override
    public Student convertToEntity(StudentDto studentDto) throws IOException {

        Student student = new Student();
        student.setName(studentDto.getName());


        return student;
    }

    @Override
    public StudentDto convertToData(Student student) throws IOException {
        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName());
        return studentDto;
    }

    @Override
    public List<Student> convertToEntities(List<StudentDto> studentDtos) throws IOException {
        return null;
    }

    @Override
    public List<StudentDto> convertToDatas(List<Student> students) throws IOException {
        return null;
    }
}
