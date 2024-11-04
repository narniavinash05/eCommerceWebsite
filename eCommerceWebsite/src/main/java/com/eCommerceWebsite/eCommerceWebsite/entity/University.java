package com.eCommerceWebsite.eCommerceWebsite.entity;

import java.util.ArrayList;
import java.util.List;

public class University {
    private Long id;

    private String name;

    private List<Department> departments = new ArrayList<>();

    public University(Long id, String name, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
    }

    public University() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}