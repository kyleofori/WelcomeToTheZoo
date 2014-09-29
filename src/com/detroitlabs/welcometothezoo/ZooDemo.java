package com.detroitlabs.welcometothezoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooDemo {
    public static void main(String[] args) {

        Zoo ROZoo = new Zoo();
        ZooMaker ROZooMaker = new ZooMaker();

        int selection = 0;
        System.out.println("Welcome to the Royal Oak Zoo!");

        do
        {

        do
        {
            ROZooMaker.showZooMenu();
            selection = ROZooMaker.getIntegerInRange(1, 8);
        } while (selection == 0);


        switch (selection) {
            case 1:
                //set up new pen using ROZoo as the zoo argument and initializing a pen for whatever type of animal user wants
                ROZooMaker.setUpNewPen(ROZoo);
                break;
            case 2:
                //remove pens
                ROZooMaker.removePen();
                break;
            case 3:
                //add an animal to a pen
//                ROZooMaker.addAnimalToPen();
                break;
            case 4:
                //add a baby animal to a pen
//                ROZooMaker.addBabyAnimalToPen();
                break;
            case 5:
                //remove animals and baby animals from pens
                ROZooMaker.removeFromPen();
                break;
            case 6:
                //display all animals in a pen
                ROZooMaker.displayAllAnimalsInPen();
                break;
            case 7:
                //display all animals in the zoo
                ROZooMaker.displayAllAnimalsInROZ();
                break;
            case 8:
                //leave the ROZ
                break;
        }
        }
        while (selection != 8);

        ROZooMaker.sayGoodbye();

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
