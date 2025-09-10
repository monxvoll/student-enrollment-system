package com.springdemo.services;

import com.springdemo.models.Course;
import com.springdemo.models.Enrollment;
import com.springdemo.models.Student;
import com.springdemo.repositories.CourseRepository;
import com.springdemo.repositories.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> findAll(){
        return this.enrollmentRepository.findAll();
    }

    public Enrollment findById(Long id){
        return this.enrollmentRepository.findById(id).orElseThrow();
    }

    public Enrollment saveEnrollment(Enrollment enrollment){
        return this.enrollmentRepository.save(enrollment);
    }

}
