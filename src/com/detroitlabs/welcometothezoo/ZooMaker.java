package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooMaker {
    public void showZooMenu() {
        System.out.println("What would you like to do now?\n");
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
        ArrayList<Animal> zooAnimals = new ArrayList<Animal>();
        ArrayList<BabyAnimal> babyZooAnimals = new ArrayList<BabyAnimal>();
        Pen emptyPen = new Pen("nothing so far", zooAnimals, babyZooAnimals);
        Scanner penNameScanner = new Scanner(System.in);

        zoo.getAllZooPens().add(emptyPen);
        System.out.println("You now have a new pen!\nWhat animal will it hold?"); //Array lists will still be empty.
        emptyPen.setPenName(penNameScanner.nextLine());
        int count = 0;
        for (Pen x : zoo.getAllZooPens()) {
            if (x != null)
                count++;
        }
        if (count == 1) {
            System.out.println("There is " + count + " pen in the Royal Oak Zoo.\n");
        } else {
            System.out.println("There are " + count + " pens in the Royal Oak Zoo.\n");
        }
    }

    public void removePen() { //this will only remove empty pens...I suppose
        System.out.println("\n**This function doesn't work yet.*\n");
    }

    public void addAnimalToPen(Zoo zoo) {
        Scanner zooScanner = new Scanner(System.in);
        System.out.println("What species is this new animal?");
        String species = zooScanner.nextLine();
        System.out.println("How big is this new animal? (Please use inches.)");
        double size = getASize();
        System.out.println("What gender is this new animal?");
        String gender = zooScanner.nextLine();
        System.out.println("Finally, what's this creature's name?");
        String name = zooScanner.nextLine();
        int babyCheck = checkIfBaby();
        Animal newAnimal;
        if (babyCheck == 0) {
            newAnimal = new Animal(size, gender, species, name);

        }
        else
        {
            System.out.println("How cute is this little creature on a scale from 1 to 10?");
            int cuteness = getIntegerInRange(1, 10);
            newAnimal = new BabyAnimal(size, gender, species, name, cuteness);

        }
        putAnimalInRightPen(newAnimal, zoo);
        displayAnimalInfo(newAnimal);

    }

    public int checkIfBaby() {
        System.out.println("Now, is this a big animal (press 0) or a baby animal (press 1)?");
        return getIntegerInRange(0, 1);
    }

    public void putAnimalInRightPen(Animal animal, Zoo zoo) {

        boolean animalPenned = false;
        for (Pen x : zoo.getAllZooPens()) {
            if (animal.getSpecies().equalsIgnoreCase(x.getPenName())) {
                addAnimalToPen(animal, x);
                animalPenned = true;
                System.out.println("This animal will be joining a family!");
                break;
            }
        }
        if (!animalPenned) {
            ArrayList<Animal> zooAnimals = new ArrayList<Animal>();
            ArrayList<BabyAnimal> babyZooAnimals = new ArrayList<BabyAnimal>();
            Pen newPen = new Pen(animal.getSpecies(), zooAnimals, babyZooAnimals);
            addAnimalToPen(animal, newPen);
            zoo.addPenToZoo(newPen);
            }
        }

    public void addAnimalToPen(Animal animal, Pen pen) {
        if (animal instanceof BabyAnimal) {
            ArrayList<BabyAnimal> babyZooAnimals = pen.getBabyZooAnimals();
            babyZooAnimals.add((BabyAnimal) animal);
        } else
        {
            ArrayList<Animal> zooAnimals = pen.getZooAnimals();
            zooAnimals.add(animal);
        }
    }


    public void removeAnimalFromPen(Pen pen, Animal animal) {
        Scanner removeScanner = new Scanner(System.in);
        System.out.println("Are you sure you want to remove " + animal.getName() + " from the Zoo?\n"
                + "Please type 'Yes' if you are sure; otherwise, you will be taken back to the main menu.");
        String temp = (removeScanner.nextLine()).toLowerCase();
        if (temp.equals("yes"))
            //here's where we need to sort out if it's a baby animal or an animal that we're removing
        {
            if(animal instanceof BabyAnimal)
            {
                pen.getBabyZooAnimals().remove(animal); //take out of baby part of pen
            }
            else
            {
                pen.getZooAnimals().remove(animal);
            }
        }
    }

    public Pen chooseAPen(Zoo zoo) {
        System.out.println("Which pen would you like to go to?");
        int choice = getIntegerInRange(1, zoo.getAllZooPens().size());
        return zoo.getAllZooPens().get(choice-1);
    }

    public Animal chooseAnAnimal(Pen pen) {
        System.out.println("Which animal do you want to take out?");
        int a = pen.getZooAnimals().size();
        int b = pen.getBabyZooAnimals().size();
        int n = a + b;
        int choice = getIntegerInRange(1, n);
        Animal animalToDelete;
        if (choice <= a) {
            animalToDelete = pen.getZooAnimals().get(choice - 1);
        } else {
            animalToDelete = pen.getBabyZooAnimals().get(choice - a - 1);
        }
        return animalToDelete;
    }


    public int displayAllPens(Zoo zoo) {
        int count = 0;
        System.out.println("Here are all the pens in the Royal Oak Zoo.");
        for (Pen x: zoo.getAllZooPens()) {
            if(x != null) {
                count++;
                System.out.print(count + "- ");
                System.out.println(x.getPenName());
            }
        }
        if (count == 0)
            System.out.println("There are no pens in this Zoo!");
        return count;
    }



    public void displayAllAnimalsInPen(Pen pen) {
        //select a pen first
        //list each animal with a number. I might have to give these animals names for this to work.
        //need a for loop
        System.out.println("Full grown animals: ");
        int countAnimals = 0;
        for(Animal x: pen.getZooAnimals()) {
            //code smell...
            if (x != null) {
                countAnimals++;
                System.out.print(countAnimals + "- ");
                System.out.println(x.getName() + ": " + x.getSize() + " inches, " + x.getGender());
            }
        }
        System.out.println("Baby animals: ");
        for(BabyAnimal x: pen.getBabyZooAnimals()) {
            if (x != null) {
                countAnimals++;
                System.out.print(countAnimals + "- ");
                System.out.println(x.getName() + ": " + x.getSize() + " inches, " + x.getGender() + ". How cute? " + x.getCuteness() + "!");
            }
        }
    }

    public void displayAllAnimalsInROZ() {
        //displayAllAnimalsInPen for each pen
        System.out.println("This function doesn't work yet.");
    }

    public void displayAnimalInfo(Animal animal) {
        System.out.println(animal.getName() + " is a " + animal.getSize() + "-inch long " + animal.getGender() + " " +
                animal.getSpecies() + ".");
    }

    public double getASize() {
        Scanner sizeScanner = new Scanner(System.in);
        double userInput = 0;
        try {
            userInput = sizeScanner.nextDouble();
            sizeScanner.nextLine();
            if (userInput <= 0) {
                System.out.println("Please enter a positive number.");
                getASize();
            }
            return userInput;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a positive number.");
            getASize();
        }
        return userInput;
    }
}

//MVP: Only remove one animal or baby animal at a time.
//MVP: Only add one animal or baby animal at a time.
//MVP: Only set up one new pen at a time.
//MVP: Only remove one pen at a time.