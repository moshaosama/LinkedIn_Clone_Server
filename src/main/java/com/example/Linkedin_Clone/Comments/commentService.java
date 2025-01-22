package com.example.Linkedin_Clone.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class commentService {
    private final commentRepository commentRepository;

    @Autowired
    commentService(commentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comments createComment(Comments comment) {
        return this.commentRepository.save(comment);
    }
}