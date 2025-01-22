package com.example.Linkedin_Clone.Post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class postService {
    private final postRepository postRepository;

    @Autowired
    postService(postRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        return this.postRepository.save(post);
    }

    public List<Post> getPosts() {
        return this.postRepository.findAll();
    }

    public void DeletePostById(Integer id) {
        this.postRepository.deleteById(id);
    }

    public Post editPost(Integer id, Integer newLike) {
        Post post = this.postRepository.findById(id).orElse(null);
        if (post.getLikes() == 0) {
            post.setLike(newLike);
        } else {
            post.setLike(0);
        }
        return this.postRepository.save(post);
    }
}