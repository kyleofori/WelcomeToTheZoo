package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;

/**
 * Created by kyleofori on 9/29/14.
 */
public class Pen {
    private String penName;
    private ArrayList<Animal> zooAnimals;
    private ArrayList<BabyAnimal> babyZooAnimals;

    public Pen(String penName, ArrayList<Animal> zooAnimals, ArrayList<BabyAnimal> babyZooAnimals) {
        this.penName = penName;
        this.zooAnimals = zooAnimals;
        this.babyZooAnimals = babyZooAnimals;
    }

    public void setZooAnimals(ArrayList<Animal> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public ArrayList<Animal> getZooAnimals() {
        return zooAnimals;
    }

    public void setBabyZooAnimals(ArrayList<BabyAnimal> babyZooAnimals) {
        this.babyZooAnimals = babyZooAnimals;
    }

    public ArrayList<BabyAnimal> getBabyZooAnimals() {
        return babyZooAnimals;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getPenName() {
        return penName;
    }
}
