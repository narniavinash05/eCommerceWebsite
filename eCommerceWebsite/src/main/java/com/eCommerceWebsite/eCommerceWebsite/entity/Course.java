package com.eCommerceWebsite.eCommerceWebsite.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Long id;

    private String name;

    private List<Professor> professors = new ArrayList<>();

    public Course(Long id, String name, List<Professor> professors) {
        this.id = id;
        this.name = name;
        this.professors = professors;
    }

    public Course() {
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

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }
}
