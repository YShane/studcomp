package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.studentRepository.StudentRepository;
import pojos.rest.Student;
/**
 * Created by samyy on 21-Sep-17.
 */
@RestController
@RequestMapping("/rest")
public class RestService {

    Logger logger = LoggerFactory.getLogger(RestService.class);
    private final StudentRepository studentRepository;

    @Autowired
    public RestService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;

    }

    @RequestMapping(value = "/cheeky")
    public String test(){
        return "test";
    }

    //@RequestMapping(value= "students/")

    @RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(value = "studentId") String studentId){
        logger.trace(studentId);
        logger.trace("here");
        Student x = studentRepository.findById(Integer.parseInt(studentId));
        return studentRepository.findById(Integer.parseInt(studentId));
    }


}
