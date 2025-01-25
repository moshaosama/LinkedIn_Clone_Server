package com.example.Linkedin_Clone.Experience;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class experienceController {
    private final experienceService experienceService;

    @Autowired
    experienceController(experienceService experienceService) {
        this.experienceService = experienceService;
    }

    @CrossOrigin("*")
    @PostMapping("/createExperience")
    public Experience createExperience(@RequestBody Experience experience) {
        return this.experienceService.createExperience(experience);
    }

    @CrossOrigin("*")
    @GetMapping("/getExperiences")
    public List<Experience> getExperiences() {
        return this.experienceService.getExperiences();
    }
}