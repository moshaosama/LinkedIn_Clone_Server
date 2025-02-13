package com.example.Linkedin_Clone.Profile;

import java.util.List;

import com.example.Linkedin_Clone.About.About;
import com.example.Linkedin_Clone.Education.Education;
import com.example.Linkedin_Clone.Experience.Experience;
import com.example.Linkedin_Clone.Language.Language;
import com.example.Linkedin_Clone.Post.Post;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer viewrs = 0;
    private String title;
    private String userName;

    @Column(unique = true, nullable = false)
    private String email;

    @JsonIgnore
    private String password;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private About about;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Experience> experience;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Education education;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Language> language;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Post> post;

    public Profile() {
    }

    public Profile(String title, String userName, String email, String password, Integer viewrs) {
        this.title = title;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.viewrs = viewrs;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getViewers() {
        return this.viewrs;
    }

    public void setViewrs(Integer viewrs) {
        this.viewrs = viewrs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
