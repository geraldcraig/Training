package com.labs.module04;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int length;
        int breadth;
        int height;
        int volume;

        System.out.println("Input length of cuboid");
        length = myScanner.nextInt();

        System.out.println("Input breadth of cuboid");
        breadth = myScanner.nextInt();

        System.out.println("Input height of cuboid");
        height = myScanner.nextInt();

        volume = length * breadth * height;

        System.out.println("Volume of cuboid is:\t" + volume);

        myScanner.close();
    }
}
