package base.repositories.studentRepository;

import org.springframework.stereotype.Repository;
import base.pojos.rest.prod.Student;
import base.repositories.BaseRepository;

/**
 * Created by samyy on 21-Sep-17.
 */
@Repository
public interface StudentRepository extends BaseRepository<Student, Integer> {

    @Override
    Student findOne(Integer Id);
}
