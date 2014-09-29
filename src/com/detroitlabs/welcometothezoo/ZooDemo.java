package com.detroitlabs.welcometothezoo;

import java.util.Scanner;

/**
 * Created by kyleofori on 9/29/14.
 */
public class ZooDemo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        ZooMaker.showZooMenu();
        String selection = userInput.nextLine();

        do
        {

        }
        while (!selection.equals("8")); //something isn't 8);

        ZooMaker.sayGoodbye();

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
