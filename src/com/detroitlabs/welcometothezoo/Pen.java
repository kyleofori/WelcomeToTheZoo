package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;

/**
 * Created by kyleofori on 9/29/14.
 */
public class Pen {
    ArrayList<Animal> ZooAnimals = new ArrayList<Animal>();

    public void setZooAnimals(ArrayList<Animal> zooAnimals) {
        ZooAnimals = zooAnimals;
    }

    public ArrayList<Animal> getZooAnimals() {
        return ZooAnimals;
    }

    ArrayList<BabyAnimal> BabyZooAnimals = new ArrayList<BabyAnimal>();
}
