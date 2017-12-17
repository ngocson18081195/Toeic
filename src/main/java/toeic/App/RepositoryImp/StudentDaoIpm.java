package toeic.App.RepositoryImp;

import org.springframework.stereotype.Repository;
import toeic.App.Entity.Student;
import toeic.App.Repository.CRUDRepository;
import toeic.App.Repository.StudentDao;

/**
 * Created by lai on 15/12/2017.
 */
@Repository
public class StudentDaoIpm extends CRUDRepositoryImp<Student,Long> {

}
