package com.springdemo.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "student")
public class Student {
        //Mapping class
        @OneToMany(mappedBy = "student") // Reference to Enrollment Object
        private List<Enrollment> enrollmentList;

        @Id
        //Generate value of type sequence
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_ID_ESTUDIANTE")
        @SequenceGenerator(name = "SQ_ID_ESTUDIANTE",sequenceName="SQ_ID_ESTUDIANTE",allocationSize = 1)
        @Column(name = "id_estudiante")
        private Long studentId;
        @Column(name="nombre")
        private String name;
        @Column (name = "apellido")
        private String lastName;
        @Column (name="email")
        private String email;


    public Student(){

    }
    public Student(Long studentId, String name, String lastName, String email) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long idStudent) {
        this.studentId = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
