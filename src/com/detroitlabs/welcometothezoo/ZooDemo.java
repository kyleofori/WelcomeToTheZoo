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
        do {
            ROZooMaker.showZooMenu();
            selection = ROZooMaker.getIntegerInRange(1, 8);
        } while (selection == 0);

        do
        {
        switch (selection) {
            case 1:
                //set up new pen
                ROZoo.getAllZooPens().add(ArrayList <Animal>);
                break;
            case 2:
                //remove pens
                break;
            case 3:
                //add an animal to a pen
                break;
            case 4:
                //add a baby animal to a pen
                break;
            case 5:
                //remove animals and baby animals from pens
                break;
            case 6:
                //display all animals in a pen
                break;
            case 7:
                //display all animals in the zoo
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
