package com.example.SMA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Long id;
    private String name;
    private String email;
    private String course;

    public Student() {
    }

    public Student( String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }   
}
