package com.example.Linkedin_Clone.About;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aboutController {
    private final aboutService aboutService;

    @Autowired
    aboutController(aboutService aboutService) {
        this.aboutService = aboutService;
    }

    @CrossOrigin("*")
    @PostMapping("/createAbout")
    public About createAbout(@RequestBody About about) {
        return this.aboutService.createAbout(about);
    }
}