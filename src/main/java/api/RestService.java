package api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repositories.studentRepository.StudentRepository;
import pojos.rest.Student;
/**
 * Created by samyy on 21-Sep-17.
 */
@RestController
@RequestMapping("/rest")
public class RestService {
    private final StudentRepository studentRepository;

    public RestService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String tempWelcome(){
        return "Welcome";

    }

    @RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(value = "studentId") String studentId){

        Student x = studentRepository.findById(Integer.parseInt(studentId));
        return studentRepository.findById(Integer.parseInt(studentId));
    }


}
