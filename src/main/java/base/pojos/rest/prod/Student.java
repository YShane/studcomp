package base.pojos.rest.prod;

/**
 * Created by samyy on 21-Sep-17.
 */

import java.time.LocalDate;
import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "student")
public class Student {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private int Id;
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "emailaddress")
    private String emailaddress;

    @Column(name = "mobilenumber")
    private String mobilenumber;

    @Column(name = "dateofbirth")
    private LocalDate dateofbirth;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
//    private University university;
//    private StudentAddress studentAddress;

}
