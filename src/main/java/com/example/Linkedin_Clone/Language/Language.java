package com.example.Linkedin_Clone.Language;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Language {
    @Id
    @GeneratedValue
    private Integer id;
    private String Language;
    private String Proficiency;

    Language(String Language, String Proficiency) {
        this.Language = Language;
        this.Proficiency = Proficiency;
    }

    Language() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return this.Language;
    }

    public void setLanguage(String language) {
        this.Language = language;
    }

    public String getProficiency() {
        return this.Proficiency;
    }

    public void setProficiency(String proficiency) {
        this.Proficiency = proficiency;
    }

}