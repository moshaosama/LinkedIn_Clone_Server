package com.example.Linkedin_Clone.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class commentController {
    private final commentRepository commentRepository;

    @Autowired
    commentController(commentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @CrossOrigin("*")
    @PostMapping("/createComment")
    public Comments createComment(@RequestBody Comments comment) {
        return this.commentRepository.save(comment);
    }
}