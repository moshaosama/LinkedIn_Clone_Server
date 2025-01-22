package com.example.Linkedin_Clone.Comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class commentController {
    private final commentService commentService;

    @Autowired
    commentController(commentService commentService) {
        this.commentService = commentService;
    }

    @CrossOrigin("*")
    @PostMapping("/createComment")
    public Comments createComment(@RequestBody Comments comment) {
        return this.commentService.createComment(comment);
    }
}