package com.springdemo.services;

import com.springdemo.models.Course;
import com.springdemo.models.Enrollment;
import com.springdemo.models.Student;
import com.springdemo.repositories.CourseRepository;
import com.springdemo.repositories.EnrollmentRepository;
import com.springdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private  CourseRepository courseRepository;

    public List<Enrollment> findAll(){
        return this.enrollmentRepository.findAll();
    }

    public Enrollment findById(Long id){
        return this.enrollmentRepository.findById(id).orElseThrow();
    }

    public Enrollment saveEnrollment(Enrollment enrollment){
        Student student = this.studentRepository.findById(enrollment.getStudent().getStudentId()).orElse(null);
        enrollment.setStudent(student);

        Course course = this.courseRepository.findById(enrollment.getCourse().getCourseId()).orElse(null);
        enrollment.setCourse(course);

        return this.enrollmentRepository.save(enrollment);
    }
    public List<Enrollment> getEnrollmentByStudent(Long studentId){
        return this.enrollmentRepository.getEnrollmentByStudent(studentId);
    }
}
