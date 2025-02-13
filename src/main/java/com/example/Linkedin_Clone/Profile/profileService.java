package com.example.Linkedin_Clone.Profile;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class profileService {
    private final profileRepository profileRepository;

    profileService(profileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile createProfile(Profile profile) {

        return this.profileRepository.save(profile);

    }

    public List<Profile> getProfiles() {
        return this.profileRepository.findAll();
    }

    public Profile[] getProfileByIdAsArray(Integer id) {
        return this.profileRepository.findById(id).map(person -> new Profile[] { person }).orElse(null);
    }

    public Profile getProfileById(Integer id) {
        return this.profileRepository.findById(id).orElse(null);
    }

    public Profile getProfileByEmail(String email) {
        return this.profileRepository.findByEmail(email).orElse(null);
    }

    public Profile editViewrsProfile(Integer id, Integer newView) {
        Profile profile = this.profileRepository.findById(id).orElse(null);
        profile.setViewrs(newView);
        return this.profileRepository.save(profile);
    }
}