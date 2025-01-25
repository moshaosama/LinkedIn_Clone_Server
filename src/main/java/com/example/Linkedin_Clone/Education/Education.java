package com.example.Linkedin_Clone.Education;

import com.example.Linkedin_Clone.Profile.Profile;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Education {
    @Id
    @GeneratedValue
    private Integer id;
    private String Title;
    private String Degree;
    private String Department;
    private String StartDate;
    private String EndDate;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "profile_id")
    private Profile profile;

    Education(Integer id, String title, String degree, String department, String startDate, String endDate) {
        this.id = id;
        this.Title = title;
        this.Degree = degree;
        this.Department = department;
        this.StartDate = startDate;
        this.EndDate = endDate;
    }

    Education() {

    }

    // Getter and Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for title
    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    // Getter and Setter for degree
    public String getDegree() {
        return this.Degree;
    }

    public void setDegree(String degree) {
        this.Degree = degree;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return this.Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    // Getter and Setter for startDate
    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        this.StartDate = startDate;
    }

    // Getter and Setter for endDate
    public String getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(String endDate) {
        this.EndDate = endDate;
    }
}