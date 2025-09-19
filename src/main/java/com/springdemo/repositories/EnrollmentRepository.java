package com.springdemo.repositories;

import com.springdemo.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository <Enrollment,Long> {
    @Query("SELECT m FROM  Enrollment m WHERE m.student.studentId= :studentId")
    List<Enrollment> getEnrollmentByStudent(@Param("studentId") Long studentId);
}
