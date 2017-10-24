package za.co.aeonsource.repository;

import za.co.aeonsource.entity.Student;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
public interface StudentRepository {
    Collection<Student> getStudents();

    Student getStudentById(Long id);

    void removeStudentById(Long id);

    Student insertStudent(Student student);

    void updateStudent(Student student);
}
