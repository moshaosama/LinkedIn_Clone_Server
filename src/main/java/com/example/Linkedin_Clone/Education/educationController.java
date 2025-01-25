package com.example.Linkedin_Clone.Education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class educationController {
    private final educationService educationService;

    @Autowired
    educationController(educationService educationService) {
        this.educationService = educationService;
    }

    @CrossOrigin("*")
    @PostMapping("/createEducation")
    public Education createEducation(@RequestBody Education education) {
        return this.educationService.createEducation(education);
    }
}