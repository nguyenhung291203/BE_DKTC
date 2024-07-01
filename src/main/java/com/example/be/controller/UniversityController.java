package com.example.be.controller;

import com.example.be.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/university")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("getAllUniversities")
    public ResponseEntity<?> getAllUniversities() {
        return ResponseEntity.ok(universityService.getAllUniversities());
    }

    @GetMapping("getUniversityById/{id}")
    public ResponseEntity<?> getUniversityById(@PathVariable String id){
        return ResponseEntity.ok(universityService.getUniversityById(id));
    }
}
