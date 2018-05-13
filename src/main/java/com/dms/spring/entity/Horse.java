package com.dms.spring.entity;

public class Horse {

    private String name;
    private Breed breed;

    public Horse() {
    }

    public Horse(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
