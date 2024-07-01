package com.example.be.service;

import com.example.be.models.entity.University;

import java.util.List;

public interface UniversityService {
    List<University> getAllUniversities();
    University getUniversityById(String id);
}
