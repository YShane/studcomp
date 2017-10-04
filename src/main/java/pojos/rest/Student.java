package pojos.rest;

/**
 * Created by samyy on 21-Sep-17.
 */

import lombok.Data;
import java.util.Date;
import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "student")
@Data
public class Student {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "emailaddress")
    private String eMailAddress;
    @Column(name = "mobilenumber")
    private String mobileNumber;
    @Column(name = "dateofbirth")
    private Date dateOfBirth;


    private University university;
    private StudentAddress studentAddress;

}
