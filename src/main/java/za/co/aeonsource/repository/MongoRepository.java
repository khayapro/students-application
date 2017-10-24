package za.co.aeonsource.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import za.co.aeonsource.entity.Student;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
@Repository
@Qualifier("mongo_repo")
public class MongoRepository implements StudentRepository {
    @Override
    public Collection<Student> getStudents() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public void removeStudentById(Long id) {

    }

    @Override
    public Student insertStudent(Student student) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }
}
