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

    public Profile[] getProfileById(Integer id) {
        return this.profileRepository.findById(id).map(person -> new Profile[] { person }).orElse(null);
    }
}