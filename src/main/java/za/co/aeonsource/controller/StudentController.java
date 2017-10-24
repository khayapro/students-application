package za.co.aeonsource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @RequestMapping(value = "/student", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student insertStudent(@RequestBody Student student){
        return service.insertStudent(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        service.updateStudent(student);
    }
}

