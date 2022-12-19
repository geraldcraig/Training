package com.gerrybyrne.module02;

import java.util.Scanner;

public class Example1 {
    /*
    Creating an instance of the Scanner class, so we can use it. The name
    we will use is myScanner as this will help us to remember that it is
    something created by us.
     */
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("------- Build your Java muscle -------");
        System.out.println("---------- Learn To Code ----------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Press any letter on the keyboard to continue");
        myScanner.next();
        System.out.println("Goodbye");
        myScanner.close();
    }

}
