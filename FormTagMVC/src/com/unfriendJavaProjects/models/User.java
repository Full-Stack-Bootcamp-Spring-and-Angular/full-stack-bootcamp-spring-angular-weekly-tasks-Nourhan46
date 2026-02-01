package com.unfriendJavaProjects.models;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String country;
    private String favoriteLanguage;
    private List<String> operatingSystems;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getFavoriteLanguage() { return favoriteLanguage; }
    public void setFavoriteLanguage(String favoriteLanguage) { this.favoriteLanguage = favoriteLanguage; }

    public List<String> getOperatingSystems() { return operatingSystems; }
    public void setOperatingSystems(List<String> operatingSystems) { this.operatingSystems = operatingSystems; }
}