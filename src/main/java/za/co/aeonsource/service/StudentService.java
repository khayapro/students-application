package za.co.aeonsource.service;

import za.co.aeonsource.entity.Student;
import za.co.aeonsource.repository.StudentRepository;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
public class StudentService {

    private StudentRepository repository;

    public Collection<Student> getStudents(){
        return repository.getStudents();
    }
}
