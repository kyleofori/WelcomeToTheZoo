package com.detroitlabs.welcometothezoo;

/**
 * Created by kyleofori on 9/29/14.
 */
public class Animal {
    private double size;
    private String gender;
    private String species;

    public Animal(double size, String gender, String species) {
        this.size = size;
        this.gender = gender;
        this.species = species;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecies() {
        return species;
    }
}
