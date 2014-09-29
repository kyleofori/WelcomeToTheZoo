package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;

/**
 * Created by kyleofori on 9/29/14.
 */
public class Pen {
    private String penName;
    private ArrayList<Animal> ZooAnimals;
    private ArrayList<BabyAnimal> BabyZooAnimals;

    public Pen(String penName) {
        this.penName = penName;
    }

    public void setZooAnimals(ArrayList<Animal> zooAnimals) {
        ZooAnimals = zooAnimals;
    }

    public ArrayList<Animal> getZooAnimals() {
        return ZooAnimals;
    }

    public void setBabyZooAnimals(ArrayList<BabyAnimal> babyZooAnimals) {
        BabyZooAnimals = babyZooAnimals;
    }

    public ArrayList<BabyAnimal> getBabyZooAnimals() {
        return BabyZooAnimals;
    }
}
