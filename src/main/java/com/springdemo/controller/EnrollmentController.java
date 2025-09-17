package com.springdemo.controller;

import com.springdemo.models.Enrollment;
import com.springdemo.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;


    @PostMapping("/save")
    public Enrollment saveEnrollment(@RequestBody Enrollment enrollment){
            return this.enrollmentService.saveEnrollment(enrollment);
    }


}
