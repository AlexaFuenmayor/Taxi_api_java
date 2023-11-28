package com.example.springboot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="taxis")
public class Taxi {
    @Id
    private int id;
    private String license;

    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {

        this.license = license;
    }

    public Taxi() {

    }

}
