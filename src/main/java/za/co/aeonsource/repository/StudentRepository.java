package za.co.aeonsource.repository;

import org.springframework.stereotype.Repository;
import za.co.aeonsource.entity.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by khayapro on 2017/10/24.
 */
@Repository
public class StudentRepository {

    //dummy data repository
    private static Map<Long, Student> students;

    {
        students = new HashMap<>();
        students.put(1L, new Student(1L, "Khaya", "Software Engineering"));
        students.put(2L, new Student(2L, "Boitumelo", "Business Management"));
        students.put(3L, new Student(3L, "Kganya", "Artificial Intelligence"));
        students.put(4L, new Student(4L, "Salome", "Engineer"));
    }

    public Collection<Student> getStudents(){
        return students.values();
    }

    public Student getStudentById(final Long id){
        return students.get(id);
    }

    public void removeStudentById(Long id) {
        students.remove(id);
    }

    public Student insertStudent(Student student) {
        //dummy repository insert
        final Long id = students.size() + 1L;
        student.setId(id);
        students.put(id, student);
        return student;
    }

    public void updateStudent(final Student student){
        final Student sdnt = students.get(student.getId());
        sdnt.setCourse(student.getCourse());
        sdnt.setName(student.getName());
        students.put(sdnt.getId(), sdnt);
    }
}
