package com.example.Linkedin_Clone.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Profile {
    @Id
    @GeneratedValue
    private Integer id;
    private String About;

    Profile(String About) {
        this.About = About;
    }

    Profile() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbout() {
        return this.About;
    }

    public void setAbout(String About) {
        this.About = About;
    }
}