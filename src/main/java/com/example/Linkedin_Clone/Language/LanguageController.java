package com.example.Linkedin_Clone.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {
    private final LanguageService languageService;

    @Autowired
    LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @CrossOrigin("*")
    @PostMapping("/createLanguage")
    public Language createLanguage(@RequestBody Language language) {
        return this.languageService.createLanguage(language);
    }
}