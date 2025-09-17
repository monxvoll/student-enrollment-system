package com.springdemo.controller;

import com.springdemo.models.Course;
import com.springdemo.models.Student;
import com.springdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/find")
    public List<Student> findAll() {
        return this.studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable("id") Long studentId) {
        return this.studentService.findById(studentId);
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return this.studentService.saveStudent(student);
    }

    @PutMapping("/update/{id}")
    public Student update(@PathVariable("id") Long studentId, @RequestBody Student newStudent){
        return this.studentService.updateStudent(studentId,newStudent);
    }

}
