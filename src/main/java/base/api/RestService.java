package base.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import base.pojos.rest.prod.Student;
import base.service.studentService.StudentService;

/**
 * Created by samyy on 21-Sep-17.
 */
@RestController
@RequestMapping("/rest")
public class RestService {

    public static final Logger logger = LoggerFactory.getLogger(RestService.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/cheeky")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(value = "studentId") int studentId){
        logger.info("here");
        return studentService.getStudentById(studentId);

    }


}
