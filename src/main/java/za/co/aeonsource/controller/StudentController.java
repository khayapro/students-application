package za.co.aeonsource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import za.co.aeonsource.entity.Student;
import za.co.aeonsource.service.StudentService;

import java.util.Collection;

/**
 * Created by khayapro on 2017/10/24.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getStudents(){
        return service.getStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable(value = "id") final Long id){
        return service.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeStudentById(@PathVariable("id") final Long id){
        service.removeStudentById(id);
    }

    public Student addStudent(Student student){
        return service.addStudent(student);
    }
}

