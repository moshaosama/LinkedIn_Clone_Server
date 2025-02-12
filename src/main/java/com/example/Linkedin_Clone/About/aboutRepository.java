package com.example.Linkedin_Clone.About;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface aboutRepository extends JpaRepository<About, Integer> {
}