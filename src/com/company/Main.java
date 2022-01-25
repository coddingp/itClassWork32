package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Objects.hash;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Cat cat = new Cat(12, "Sybirka");
        Cat cat1 = new Cat(8, "Myshka");
        Cat cat2 = new Cat(12, "Sybirka");
        Cat cat3 = new Cat(5, "Myshkar");


        System.out.println(hash(cat));
        System.out.println(hash(cat1));

        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.add(cat);
        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat3);
        int count = 0;

        for (int i = 0; i < catsList.size(); i++) {
            if (i + 1 < catsList.size()) {
                for (Cat value : catsList) {
                    if (hash(catsList.get(i)) == (hash(value))) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);


//
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < catHashes.length(); i++){
//            string.append(reader);
//        }
//
//        System.out.println(string);


    }
//    public static void main(String[] args) {
//        Scanner scanInteger = new Scanner(System.in);
//
//        ArrayList<Multiple> multiples = new ArrayList<>();
//        System.out.println(multiples);
//        for (int i = 0; i < 3; i++){
//            System.out.println("Enter any of two digits: ");
//            Multiple multiple = new Multiple(scanInteger.nextInt(), scanInteger.nextInt());
//            multiples.add(multiple);
//        }
//        System.out.println(multiples);
//    }
//    public static void add(){
//        for (){
//
//        }
//    }

}
