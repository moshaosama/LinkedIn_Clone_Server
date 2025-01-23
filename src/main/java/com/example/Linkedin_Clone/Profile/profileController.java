package com.example.Linkedin_Clone.Profile;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profileController {
    private final profileRepository profileRepository;

    profileController(profileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @CrossOrigin("*")
    @PostMapping("/createAbout")
    public ResponseEntity<?> createAbout(@RequestBody Profile profile) {
        Profile newprofile = new Profile();
        newprofile.setAbout(profile.getAbout());
        if (this.profileRepository.findAll().size() == 1) {
            return ResponseEntity.badRequest().body("you can't add anything to this profile");
        } else {
            return ResponseEntity.ok().body(this.profileRepository.save(newprofile));
        }
    }

    @CrossOrigin("*")
    @GetMapping("/getAbout")
    public List<Profile> getAbout() {
        return this.profileRepository.findAll();
    }
}