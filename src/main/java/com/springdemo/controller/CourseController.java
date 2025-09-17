package com.springdemo.controller;

import com.springdemo.models.Course;
import com.springdemo.models.Student;
import com.springdemo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/find")
    public List<Course> findAll() {
        return this.courseService.findAll();
    }

    @GetMapping("/{id}")
    public Course findById(@PathVariable("id") Long courseId) {
        return this.courseService.findById(courseId);
    }

    @PostMapping("/save")
    public Course saveCourse(@RequestBody Course course){
        return this.courseService.saveCourse(course);
    }
}
