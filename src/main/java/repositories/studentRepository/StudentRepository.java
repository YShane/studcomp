package repositories.studentRepository;

import pojos.rest.Student;
import repositories.BaseRepository;

/**
 * Created by samyy on 21-Sep-17.
 */
public interface StudentRepository extends BaseRepository<Student, Integer> {


    public Student findById(int id);
}
