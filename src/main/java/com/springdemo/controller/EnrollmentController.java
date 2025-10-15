package com.springdemo.controller;

import com.springdemo.models.Enrollment;
import com.springdemo.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;


    @GetMapping("/find")
    public List<Enrollment> findAll(){
        return this.enrollmentService.findAll();
    }

    @GetMapping("/{id}")
    public Enrollment findById(@PathVariable("id") Long enrollmentId) {
        return this.enrollmentService.findById(enrollmentId);
    }


    @PostMapping("/save")
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment){
            return this.enrollmentService.saveEnrollment(enrollment);
    }
    @PutMapping("/update/{id}")
    public Enrollment update(@PathVariable("id") Long enrollmentId, @RequestBody Enrollment newEnrollment){
        return this.enrollmentService.updateEnrollment(enrollmentId,newEnrollment);
    }

    @GetMapping("/by-student/{id}")
    public List<Enrollment> getEnrollmentByStudent(@PathVariable("id") Long studentId){
        return this.enrollmentService.getEnrollmentByStudent(studentId);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnrollment(@PathVariable("id") Long enrollmentId) {
        this.enrollmentService.deleteEnrollment(enrollmentId);
    }
}
