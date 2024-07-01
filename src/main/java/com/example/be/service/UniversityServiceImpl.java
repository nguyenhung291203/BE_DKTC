package com.example.be.service;

import com.example.be.models.entity.University;
import com.example.be.respository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService{
    @Autowired
    private UniversityRepository universityRepository;
    @Override
    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public University getUniversityById(String id) {
        return universityRepository.findById(id).get();
    }
}
