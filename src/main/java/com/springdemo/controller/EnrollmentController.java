package com.springdemo.controller;

import com.springdemo.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController {
    @Autowired
    private EnrollmentService enrollmentService;
}
