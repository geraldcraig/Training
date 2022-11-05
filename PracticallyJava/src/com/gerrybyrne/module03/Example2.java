/*
The package is simply an area that holds our class.
This package has used the . to separate sections of the package name.
The parts essentially represent folders within our project.
Package names are by tradition all small letters.
*/

package com.gerrybyrne.module03;

// Program Description:  A simple Java program to output text and read input
// Author:               Gerry Byrne
// Date of creation:     17/10/2022

import java.util.Scanner;

// This is our only class and it will contain the Main method
public class Example2 {
    /*
    Creating an instance of the Scanner class, so we can use it. The name
    we will use is myScanner as this will help us to remember that it is
    something created by us.
     */
    static Scanner myScanner = new Scanner(System.in);

    /*
    We now have our main method which will contain all our code.
    As we become a better developer, we will not have all our code
    contained within the main method.
    This would be seen as poor code and not fitting in with the design
    principle of modular code.
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------- Build your Java muscle -------");
        System.out.println("---------- Learn To Code ----------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Press any letter on the keyboard to continue");
        myScanner.next(); // This code line waits for the user to input a String
        System.out.println("Goodbye");
        myScanner.close();

    } // End of main() method
} // End of class

