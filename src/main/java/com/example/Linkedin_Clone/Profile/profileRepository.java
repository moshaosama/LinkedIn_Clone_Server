package com.example.Linkedin_Clone.Profile;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface profileRepository extends JpaRepository<Profile, Integer> {
    Optional<Profile> findByEmail(String email);
}
