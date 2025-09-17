package com.springdemo.models;


import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "enrollment")
public class Enrollment {
    //We added a foreign key between the enrollment and student tables.
    @ManyToOne
    @JoinColumn(name = "ID_ESTUDIANTE")
    private Student student;

    //We added a foreign key between the enrollment and course tables.
    @ManyToOne
    @JoinColumn(name = "ID_CURSO")
    private Course course;



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_ID_MATRICULA")
    @SequenceGenerator(name = "SQ_ID_MATRICULA",sequenceName="SQ_ID_MATRICULA",allocationSize = 1)
    @Column(name = "id_matricula")
    private Long enrollmentId;
    @Column(name="semestre")
    private String semester;

    public Enrollment(){

    }
    public Enrollment(Student student, Course course, Long enrollmentId, String semester) {
        this.student = student;
        this.course = course;
        this.enrollmentId = enrollmentId;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
}
