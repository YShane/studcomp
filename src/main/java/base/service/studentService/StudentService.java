package base.service.studentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import base.pojos.rest.prod.Student;
import base.repositories.studentRepository.StudentRepository;

/**
 * Created by samyy on 06-Oct-17.
 */
@Service
public class StudentService {

    public static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(int studentId){

        Student student = studentRepository.findOne((studentId));
        return student;
    }
}
