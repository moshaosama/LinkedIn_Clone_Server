package com.example.Linkedin_Clone.Education;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class educationService {
    private final educationRepository educationRepository;

    @Autowired
    educationService(educationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education createEducation(Education education) {
        return this.educationRepository.save(education);
    }
}