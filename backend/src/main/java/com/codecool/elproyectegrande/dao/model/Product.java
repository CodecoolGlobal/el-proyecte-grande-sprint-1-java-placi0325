package com.codecool.elproyectegrande.dao.model;

public class Product {
    private int id;
    private String name;
    private String description;
    private int userID;

    public Product(int id, String name, String description, int userID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
