package com.springdemo.services;

import com.springdemo.models.Course;
import com.springdemo.models.Student;
import com.springdemo.repositories.CourseRepository;
import com.springdemo.repositories.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll(){
        return this.courseRepository.findAll();
    }

    public Course findById(Long id){
        return this.courseRepository.findById(id).orElseThrow();
    }

    public Course saveCourse(Course course){
        return this.courseRepository.save(course);
    }


}
