package com.example.Linkedin_Clone.Post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final postService postService;

    @Autowired
    PostController(postService postService) {
        this.postService = postService;
    }

    @CrossOrigin("*")
    @PostMapping("/createPost")
    public String createPost(@RequestBody Post post) {
        postService.createPost(post);
        return "Create post Successfully!!️‍🔥";
    }

    @CrossOrigin("*")
    @GetMapping("/Posts")
    public List<Post> getPosts() {
        return this.postService.getPosts();
    }

    @CrossOrigin("*")
    @DeleteMapping("/deletePost/{id}")
    public String DeletePostBtId(@PathVariable Integer id) {
        this.postService.DeletePostById(id);
        return "Deleted Successfully!!";
    }

    @CrossOrigin("*")
    @PutMapping("/EditLike/{id}")
    public void editPost(@PathVariable Integer id) {
        this.postService.editPost(id, 1);
    }
}