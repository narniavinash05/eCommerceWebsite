package com.eCommerceWebsite.eCommerceWebsite.entity;

public class Office {
    private Long id;

    private String location;

    private Professor professor;

    public Office(Long id, String location, Professor professor) {
        this.id = id;
        this.location = location;
        this.professor = professor;
    }

    public Office() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}