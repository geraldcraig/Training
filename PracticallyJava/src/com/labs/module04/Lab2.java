package com.labs.module04;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int length;
        int breadth;
        int area;

        System.out.println("Input length of rectangle");
        length = myScanner.nextInt();

        System.out.println("Input breadth of rectangle");
        breadth = myScanner.nextInt();

        area = length * breadth;

        System.out.println("Area of rectangle is:\t" + area);

        myScanner.close();
    }
}
