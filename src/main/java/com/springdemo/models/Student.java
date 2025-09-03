package com.springdemo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

        @Id
        @Column(name = "id_estudiante")
        private Long studentId;
        @Column(name="nombre")
        private String name;
        @Column (name = "apellido")
        private String lastName;
        @Column (name="email")
        private String email;


    public Student(Long studentId, String name, String lastName, String email) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getIdStudent() {
        return studentId;
    }

    public void setIdStudent(Long idStudent) {
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
