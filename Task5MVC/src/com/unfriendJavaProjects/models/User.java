package com.unfriendJavaProjects.models;

import java.time.LocalDate;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate date;
    private String city;

    public User(String firstname, String lastname, String email, LocalDate date, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.date = date;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
