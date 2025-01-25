package com.example.Linkedin_Clone.About;

import com.example.Linkedin_Clone.Profile.Profile;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class About {
    @Id
    @GeneratedValue
    private Integer id;
    private String Title;

    @OneToOne
    @JoinColumn(name = "profile_id")
    @JsonBackReference
    private Profile profile;

    About(String Title) {
        this.Title = Title;
    }

    About() {
    }

    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return Title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.Title = title;
    }

}