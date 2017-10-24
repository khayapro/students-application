package za.co.aeonsource.controller;

import za.co.aeonsource.entity.Student;
import za.co.aeonsource.service.StudentService;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
public class StudentController {

    private StudentService service;

    public Collection<Student> getStudents(){
        return service.getStudents();
    }
}
