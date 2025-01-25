package com.example.Linkedin_Clone.About;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aboutService {
    private final aboutRepository aboutRepository;

    @Autowired
    aboutService(aboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public About createAbout(About about) {
        return this.aboutRepository.save(about);
    }

}