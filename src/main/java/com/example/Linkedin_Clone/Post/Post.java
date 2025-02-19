package com.example.Linkedin_Clone.Post;

import java.util.List;

import com.example.Linkedin_Clone.Comments.Comments;
import com.example.Linkedin_Clone.Profile.Profile;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    @NotNull
    private String Title;
    private String userName;
    private String Image;
    private Integer Likes = 0;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Comments> comments;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    @JsonBackReference
    private Profile profile;

    Post(String Title, Integer Likes, String Comment, String userName, String Image) {
        this.Title = Title;
        this.Likes = Likes;
        this.userName = userName;
        this.Image = Image;
    }

    Post() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return this.userName;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getImage() {
        return this.Image;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setLike(Integer like) {
        this.Likes = like;
    }

    public Integer getLikes() {
        return this.Likes;
    }

    public void setTitle(Integer Likes) {
        this.Likes = Likes;
    }
}