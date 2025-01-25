package com.example.Linkedin_Clone.Experience;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienceService {
    private final experienceRepository experienceRepository;

    @Autowired
    experienceService(experienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public Experience createExperience(Experience experience) {
        return this.experienceRepository.save(experience);
    }

    public List<Experience> getExperiences() {
        return this.experienceRepository.findAll();
    }
}