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
        if (this.educationRepository.findAll().size() == 0) {
            return this.educationRepository.save(education);
        } else {
            this.educationRepository.deleteAll();
            return this.educationRepository.save(education);
        }
    }
}