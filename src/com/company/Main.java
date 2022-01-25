package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInteger = new Scanner(System.in);

        ArrayList<Multiple> multiples = new ArrayList<>();
        System.out.println(multiples);
        for (int i = 0; i < 3; i++){
            System.out.println("Enter any of two digits: ");
            Multiple multiple = new Multiple(scanInteger.nextInt(), scanInteger.nextInt());
            multiples.add(multiple);
        }
        System.out.println(multiples);
    }
    public static void add(){
        for (){

        }
    }

}
