package com.example.Linkedin_Clone.Experience;

import java.lang.reflect.Array;

import com.example.Linkedin_Clone.Profile.Profile;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Experience {
    @Id
    @GeneratedValue
    private Integer id;
    private String Title;
    private String employmentType;
    private String Company;
    private String StartDate;
    private String EndDate;
    private String Location;
    private String LocationType;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    @JsonBackReference
    private Profile profile;

    Experience(String title, String employmentType, String company, String startDate, String endDate, String location,
            String locationType, Array Skills) {
        this.Title = title;
        this.employmentType = employmentType;
        this.Company = company;
        this.StartDate = startDate;
        this.EndDate = endDate;
        this.Location = location;
        this.LocationType = locationType;
    }

    Experience() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getCompany() {
        return this.Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public String getStartData() {
        return this.StartDate;
    }

    public void setStartData(String startData) {
        this.StartDate = startData;
    }

    public String getEndData() {
        return this.EndDate;
    }

    public void setEndData(String endData) {
        this.EndDate = endData;
    }

    public String getLocation() {
        return this.Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getLocationType() {
        return LocationType;
    }

    public void setLocationType(String locationType) {
        this.LocationType = locationType;
    }
}