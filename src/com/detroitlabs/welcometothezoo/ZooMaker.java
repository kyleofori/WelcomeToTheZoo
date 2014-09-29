package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooMaker {
    public void showZooMenu() {
        System.out.println("What would you like to do now?");
        System.out.println("1 - Set up new pens.");
        System.out.println("2 - Remove pens.");
        System.out.println("3 - Add an animal to a pen.");
        System.out.println("4 - Add a baby animal to a pen.");
        System.out.println("5 - Remove an animal or baby animal from a pen.");
        System.out.println("6 - Display all the animals in a pen.");
        System.out.println("7 - Display all the animals in the Royal Oak Zoo.");
        System.out.println("8 - Leave the ROZ.");
    }

    public void sayGoodbye() {
        System.out.println("Come back soon!");
    }

    public int getIntegerInRange(int low, int high) {
        Scanner taskTypeScanner = new Scanner(System.in);
        int taskType = 0;
        try {
            int taskTypeScannerInput = taskTypeScanner.nextInt();
            if (taskTypeScannerInput >= low && taskTypeScannerInput <= high) {
                taskType = taskTypeScannerInput;
            } else {
                System.out.println("Sorry, your input is invalid.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Sorry, your input is invalid.");
        }
        return taskType;
    }

    public void setUpNewPen(Zoo zoo) {
        Pen emptyPen = new Pen();
        zoo.getAllZooPens().add(emptyPen);
        System.out.println("You now have a new pen!\n");
        int count = 0;
        for(Pen x: zoo.getAllZooPens())
        {
            if(x != null)
                count++;
        }
        if(count == 1) {
            System.out.println("There is "+count+" pen in the Royal Oak Zoo.\n");
        }
        else
        {
            System.out.println("There are " + count + " pens in the Royal Oak Zoo.\n");
        }
    }

    public void removePen() { //this will only remove empty pens...I suppose
        System.out.println("This function doesn't work yet.");
    }

    public void addAnimalToPen(Zoo zoo) {
        //Assume first that this is animal does not yet exist in the zoo
        int x = 0;
//        if(zoo.getAllZooPens().get(x) != null)
//        {
//            x++; //Passing-by-value? Will to increase outside of this if statement? This isn't a method, so I think it will.
//            //get info about new animal
//        }
        System.out.println(x);
        Scanner zooScanner = new Scanner(System.in);
        System.out.println("How big is this new animal?");
        try
        {
            double size = zooScanner.nextDouble();
            zooScanner.nextLine();
            if (size <= 0)
            {
                System.out.println("Please enter a positive number.");
                //then DO SOMETHING ABOUT IT
            }
        }

        catch (InputMismatchException e)
        {
            System.out.println("Please enter a positive number.");
        }
        System.out.println("What gender is this new animal?");
        String gender = zooScanner.nextLine();
        System.out.println("What species is this new animal?");
        String species = zooScanner.nextLine();
        System.out.println("Finally, what's this creature's name?");
        String name = zooScanner.nextLine();
        Animal newAnimal = new Animal(12, gender, species, name);
        zoo.getAllZooPens().get(x).getZooAnimals().add(newAnimal); //I want the first empty pen

        displayAnimalInfo(newAnimal);
    }

    public void addBabyAnimalToPen(BabyAnimal newBabyAnimal) {
        //same assumptions as for addAnimalToPen
        System.out.println("This function doesn't work yet.");
    }

    public void removeFromPen() {
        System.out.println("This function doesn't work yet.");
        //select type of animal (leads to pen), then animal from within ROZoo
        //ask "do you want to remove this creature"
        //use the getIntInRange: 1 to remove, 0 to not
    }

    public void displayAllAnimalsInPen() {
        //select a pen first
        //list each animal with a number. I might have to give these animals names for this to work.
        System.out.println("This function doesn't work yet.");
    }

    public void displayAllAnimalsInROZ() {
        //displayAllAnimalsInPen for each pen
        System.out.println("This function doesn't work yet.");
    }

    public void displayAnimalInfo(Animal animal) {
        System.out.println(animal.getName()+" is a "+animal.getSize()+"-inch long "+animal.getGender()+" "+
                animal.getSpecies()+".");
    }
    //MVP: Only remove one animal or baby animal at a time.
    //MVP: Only add one animal or baby animal at a time.
    //MVP: Only set up one new pen at a time.
    //MVP: Only remove one pen at a time.
}
