package com.example.Linkedin_Clone.Profile;

import java.util.List;

import com.example.Linkedin_Clone.About.About;
import com.example.Linkedin_Clone.Education.Education;
import com.example.Linkedin_Clone.Experience.Experience;
import com.example.Linkedin_Clone.Language.Language;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
    @Id
    private Integer id = 1;
    private String Title;
    private String userName;
    private String Email;
    private String Password;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private About about;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Experience> Experience;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Education education;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL)
    private List<Language> language;

    Profile(String title, String userName, String Email, String Password) {
        this.Title = title;
        this.userName = userName;
        this.Email = Email;
        this.Password = Password;
    }

    Profile() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    // Setter for userName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return this.Title;
    }

    // Setter for userName
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // Getter for email
    public String getEmail() {
        return this.Email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.Email = email;
    }

    // Getter for password
    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}