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
    @Column(name = "id_matricula")
    private Long enrollmentId;
    @Column(name="semestre")
    private String semester;


    public Enrollment(Long enrollmentId, String semester) {
        this.enrollmentId = enrollmentId;
        this.semester = semester;
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
