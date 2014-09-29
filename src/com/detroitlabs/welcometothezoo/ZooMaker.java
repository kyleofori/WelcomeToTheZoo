package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooMaker {
    public void showZooMenu() {
        System.out.println("Welcome to the Royal Oak Zoo!\nHow would you like to start your adventure?");
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

    public void setUpNewPen(Zoo zoo, Pen pen) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What species of animal will this pen hold?");
        String species = userInput.nextLine();
        zoo.getAllZooPens().add(pen);
        System.out.println("You now have a new pen!");
    }

    public void removePen() {

    }

    public void addAnimalToPen() {

    }

    public void addBabyAnimalToPen() {

    }

    public void removeFromPen() {

    }

    public void displayAllAnimalsInPen() {

    }

    public void displayAllAnimalsInROZ() {

    }

    //MVP: Only remove one animal or baby animal at a time.
    //MVP: Only add one animal or baby animal at a time.
    //MVP: Only set up one new pen at a time.
    //MVP: Only remove one pen at a time.
}
