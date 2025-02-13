package com.example.Linkedin_Clone.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profileController {
    private final profileService profileService;

    @Autowired
    profileController(profileService profileService) {
        this.profileService = profileService;
    }

    @CrossOrigin("*")
    @PostMapping("/CreateProfile")
    public Profile createProfile(@RequestBody Profile profile) {
        return this.profileService.createProfile(profile);
    }

    @CrossOrigin("*")
    @GetMapping("/Profiles")
    public List<Profile> getProfiles() {
        return this.profileService.getProfiles();
    }

    @CrossOrigin("*")
    @GetMapping("/profileArray/{id}")
    public Profile[] getProfileByIdasArray(@PathVariable Integer id) {
        return this.profileService.getProfileByIdAsArray(id);
    }

    @CrossOrigin("*")
    @GetMapping("/profile/{id}")
    public Profile getProfileById(@PathVariable Integer id) {
        return this.profileService.getProfileById(id);
    }

    @CrossOrigin("*")
    @GetMapping("/profile/email/{email}")
    public Profile getProfileByEmail(@PathVariable String email) {
        return this.profileService.getProfileByEmail(email);
    }

    @CrossOrigin("*")
    @PutMapping("/editViewers/{id}/{newViewer}")
    public Profile editViewers(@PathVariable Integer id, @PathVariable Integer newViewer) {
        return this.profileService.editViewrsProfile(id, newViewer);
    }

}