package com.springdemo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    //Mapping class
    @OneToMany(mappedBy = "course") // Reference to Enrollment Object
    private List<Enrollment> enrollmentList;



    @Id
    @Column(name = "id_curso")
    private Long courseId;
    @Column(name="creditos")
    private int credits;
    @Column (name = "descripcion")
    private String description;

    public Course(Long courseId, int credits, String description) {
        this.courseId = courseId;
        this.credits = credits;
        this.description = description;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
