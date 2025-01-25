package com.example.Linkedin_Clone.Profile;

import com.example.Linkedin_Clone.About.About;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String Email;
    private String Password;

    @OneToOne(mappedBy = "profile", cascade = CascadeType.ALL)
    @JsonManagedReference
    private About about;

    Profile(String userName, String Email, String Password) {
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