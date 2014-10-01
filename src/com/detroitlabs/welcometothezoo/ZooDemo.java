package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooDemo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ZooMaker zooMaker = new ZooMaker();

        int selection = 0;
        System.out.println("Welcome to the Royal Oak Zoo!");

        do
        {

        do
        {
            zooMaker.showZooMenu();
            selection = zooMaker.getIntegerInRange(1, 8);
        } while (selection == 0);


        switch (selection) {
            case 1:
                //set up new pen using ROZoo as the zoo argument and initializing a pen for whatever type of animal user wants
                zooMaker.setUpNewPen(zoo);
                break;
            case 2:
                //remove pens
                zooMaker.removePen();
                break;
            case 3:
                //add an animal to a pen
                zooMaker.addAnimalToPen(zoo);
                break;
            case 4:
                //add a baby animal to a pen
                zooMaker.addAnimalToPen(zoo);
                break;
            case 5:
                //remove animals and baby animals from pens
                //ROZooMaker.removeAnimalFromPen(ROZoo, );
                zooMaker.displayAllPens(zoo);
                Pen penChosen = zooMaker.chooseAPen(zoo);
                zooMaker.displayAllAnimalsInPen(penChosen);
                zooMaker.chooseAnAnimal(penChosen);
//                zooMaker.removeAnimalFromPen(zoo);
                break;
            case 6:
                //display all animals in a pen
                //zooMaker.displayAllAnimalsInPen();
                break;
            case 7:
                //display all animals in the zoo
                zooMaker.displayAllAnimalsInROZ();
                break;
            case 8:
                //leave the ROZ
                break;
        }
        }
        while (selection != 8);

        zooMaker.sayGoodbye();

//        Write a program that allows the zookeeper to:
//        1.) Set up new Pens
//        2.) Remove Pens
//        3.) Add an Animal to a Pen
//        4.) Add a BabyAnimal to a Pen
//        5.) Remove Animals and BabyAnimals from pens
//        6.) Display all the Animals in a Pen
//        7.) Display all the Animals in the Zoo.
        }
    }
