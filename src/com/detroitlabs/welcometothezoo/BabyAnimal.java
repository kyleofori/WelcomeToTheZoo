package com.detroitlabs.welcometothezoo;

/**
 * Created by kyleofori on 9/29/14.
 */
public class BabyAnimal extends Animal {
    private double size;
    private String gender;
    private String species;
    private String name;
    private int cuteness;

    public BabyAnimal(double size, String gender, String species, String name, int cuteness) {
        super(size, gender, species, name);
        this.cuteness = cuteness;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    public int getCuteness() {
        return cuteness;
    }
}
