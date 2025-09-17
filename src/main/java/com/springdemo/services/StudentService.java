package com.springdemo.services;

import com.springdemo.models.Student;
import com.springdemo.repositories.EnrollmentRepository;
import com.springdemo.repositories.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;



    /**
     * Finds all students in the database.
     * @return A list of all Student objects.
     */
    public List<Student> findAll(){
        return this.studentRepository.findAll();
    }

    /**
     * Finds a student by their unique ID.
     * @param id The ID of the student to find.
     * @return The Student object if found.
     * @throws java.util.NoSuchElementException if the student is not found.
     */
    public Student findById(Long id){
        return this.studentRepository.findById(id).orElseThrow();
    }

    /**
     * Saves a new student or updates an existing one in the database.
     * @param student The Student object to save.
     * @return The saved or updated Student object.
     */
    public Student saveStudent(Student student){
        return this.studentRepository.save(student);
    }

    public Student updateStudent(Long studentId, Student student){
        Student st = this.studentRepository.findById(studentId).orElse(null);
        assert st != null;
        BeanUtils.copyProperties(student,st,"id_estudiante");
        return  this.studentRepository.save(st);
    }
}
