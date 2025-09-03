package com.springdemo.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enrollment")
public class Enrollment {

    @Id
    @Column(name = "id_matricula")
    private Long enrollmentId;
    @Column(name="semestre")
    private String semester;
    @Column (name = "id_curso")
    private String id_course;
    @Column (name="id_estudiante")
    private String studentId;

    public Enrollment(Long enrollmentId, String semester, String id_course, String studentId) {
        this.enrollmentId = enrollmentId;
        this.semester = semester;
        this.id_course = id_course;
        this.studentId = studentId;
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getId_course() {
        return id_course;
    }

    public void setId_course(String id_course) {
        this.id_course = id_course;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
