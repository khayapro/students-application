package za.co.aeonsource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import za.co.aeonsource.entity.Student;
import za.co.aeonsource.repository.StudentRepository;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
@Component
public class StudentService {

    @Autowired
    @Qualifier("my_sql_db")
    private StudentRepository repository;

    public Collection<Student> getStudents(){
        return repository.getStudents();
    }

    public Student getStudentById(final Long id){
        return repository.getStudentById(id);
    }

    public void removeStudentById(Long id) {
        repository.removeStudentById(id);
    }

    public Student insertStudent(Student student) {
        return repository.insertStudent(student);
    }

    public void updateStudent(final Student student){
        repository.updateStudent(student);
    }
}
