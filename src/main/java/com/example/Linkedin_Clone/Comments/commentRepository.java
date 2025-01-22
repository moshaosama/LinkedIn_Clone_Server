package com.example.Linkedin_Clone.Comments;

import org.springframework.data.jpa.repository.JpaRepository;

public interface commentRepository extends JpaRepository<Comments, Integer> {
}