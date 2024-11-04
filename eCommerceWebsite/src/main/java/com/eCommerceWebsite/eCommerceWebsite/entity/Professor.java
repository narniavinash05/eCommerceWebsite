package com.eCommerceWebsite.eCommerceWebsite.entity;

import java.util.ArrayList;
import java.util.List;
public class Professor {
    private Long id;

    private String name;

    private Department department;

    private Office office;

    private List<Course> courses = new ArrayList<>();

    public Professor(Long id, String name, Department department, Office office, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.office = office;
        this.courses = courses;
    }

    public Professor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}