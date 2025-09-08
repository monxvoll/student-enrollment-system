package com.springdemo.repositories;

import com.springdemo.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository <Enrollment,Long> {
}
