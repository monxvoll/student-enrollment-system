package com.springdemo.services;

import com.springdemo.models.Course;
import com.springdemo.repositories.CourseRepository;
import org.springframework.beans.BeanUtils;
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

    public Course updateCourse(Long courseId, Course newCourse){
        Course crs = this.courseRepository.findById(courseId).orElse(null);
        assert crs != null;
        BeanUtils.copyProperties(newCourse,crs,"id_curso");
        return  this.courseRepository.save(crs);
    }

    public void deleteCourse(Long courseId) {
        this.courseRepository.deleteById(courseId);
    }
}
