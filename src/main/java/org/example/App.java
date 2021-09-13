/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int length;
        int width;
        int area;

        /*Creating constant*/
        final double value = 0.09290304;

        /*Prompting for length of room in feet*/
        System.out.println("What is the length of the room in feet?");
        length = scan.nextInt();

        /*Prompting for width of room in feet*/
        System.out.println("What is the width of the room in feet?");
        width = scan.nextInt();

        /*Calculating area*/
        area = length * width;
        /*Converting square feet to square meters*/
        double conversion = area * value;

        /*Displaying area in square feet and square meters*/
        System.out.printf("You entered dimensions of %d feet by %d feet.\n", +length, +width);
        System.out.printf("The area is\n");
        System.out.printf("%d square feet\n", +area);
        System.out.printf("%.3f square meters", conversion);
    }
}



