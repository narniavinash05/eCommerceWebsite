package com.eCommerceWebsite.eCommerceWebsite.entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;

    private String name;

    private University university;

    private List<Professor> professors = new ArrayList<>();

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

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public Department(Long id, String name, University university, List<Professor> professors) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.professors = professors;
    }

    public Department() {
    }

}