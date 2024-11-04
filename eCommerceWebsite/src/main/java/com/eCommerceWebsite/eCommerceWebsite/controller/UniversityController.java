package com.eCommerceWebsite.eCommerceWebsite.controller;

import com.eCommerceWebsite.eCommerceWebsite.entity.University;
import com.eCommerceWebsite.eCommerceWebsite.service.UniversityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }
//
//    @GetMapping
//    public List<University> getAllUniversities() {
//        return universityService.getAllUniversities();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<University> getUniversityById(@PathVariable Long id) {
//        return universityService.getUniversityById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<University> createUniversity(@RequestBody University university) {
//        University createdUniversity = universityService.addUniversity(university);
//        return new ResponseEntity<>(createdUniversity, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<University> updateUniversity(@PathVariable Long id, @RequestBody University updatedUniversity) {
//        University university = universityService.updateUniversity(id, updatedUniversity);
//        return university != null ? ResponseEntity.ok(university) : ResponseEntity.notFound().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUniversity(@PathVariable Long id) {
//        boolean deleted = universityService.deleteUniversity(id);
//        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
//    }
}
