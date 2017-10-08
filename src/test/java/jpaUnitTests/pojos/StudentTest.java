package jpaUnitTests.pojos;

import org.junit.Test;
import base.pojos.rest.prod.Student;
import javax.persistence.Column;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 * Created by samyy on 08-Oct-17.
 */
public class StudentTest {

    @Test
    public void typeAnnotations(){
        //assert
        AssertAnnotations.assertType(Student.class, javax.persistence.Entity.class, Table.class);
    }

    @Test

    public void fieldAnnotations() {

        // assert

        AssertAnnotations.assertField(Student.class, "Id", GeneratedValue.class);

        AssertAnnotations.assertField(Student.class, "firstname", Column.class);

        AssertAnnotations.assertField(Student.class, "lastname", Column.class);

        AssertAnnotations.assertField(Student.class, "emailaddress", Column.class);

        AssertAnnotations.assertField(Student.class, "mobilenumber", Column.class);

        AssertAnnotations.assertField(Student.class, "dateofbirth", Column.class);

    }

    public void methodAnnotations(){
        AssertAnnotations.assertMethod(

                Student.class, "getId", Id.class);

        AssertAnnotations.assertMethod(

                Student.class, "getFirstname");

        AssertAnnotations.assertMethod(

                Student.class, "getLastname");

        AssertAnnotations.assertMethod(

                Student.class, "getEmailaddress");

        AssertAnnotations.assertMethod(

                Student.class, "getMobilenumber");

        AssertAnnotations.assertMethod(

                Student.class, "getDateofbirth");

    }
}
