package com.eCommerceWebsite.eCommerceWebsite.service;

import com.eCommerceWebsite.eCommerceWebsite.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {
    List<Professor> Professors =new ArrayList<>();
    Office office = new Office(1L, "Admin Building", new Professor() );
    Department department = new Department(1L, "Java", new University(), Professors);
    List<Course> courses =new ArrayList<>();
    Professor professor1 = new Professor(1L, "Dr. John Doe", department, office, courses);
    Professor professor2 = new Professor(2L, "Dr. Jane Smith", department,  office, courses);
    Course course1 = new Course(1L, "Algorithms", Professors );
    Course course2 = new Course(2L, "Data Structures", Professors);
    //professor2.get
    //office.get
}
