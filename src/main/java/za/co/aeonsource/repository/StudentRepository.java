package za.co.aeonsource.repository;

import za.co.aeonsource.entity.Student;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by khayapro on 2017/10/24.
 */

public class StudentRepository {

    //dummy data repository
    private static Map<Long, Student> students;

    {
        students = new HashMap<>();
        students.put(1L, new Student(1L, "Khaya", "Software Engineering"));
        students.put(1L, new Student(2L, "Boitumelo", "Business Management"));
        students.put(1L, new Student(3L, "Kganya", "Artificial Intelligence"));
        students.put(1L, new Student(4L, "Salome", "Engineer"));
    }

    public Collection<Student> getStudents(){
        return students.values();
    }

}
