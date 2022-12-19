package com.gerrybyrne.module11;

import java.util.Scanner;

public class RectangleFormulae {

    Scanner myScanner = new Scanner(System.in);

    public void areaOfRectangle() {
        double lengthOfRectangle = 0;
        double breadthOfRectangle = 0;
        double areaOfRectangle = 0;

        System.out.println("\nWhat is the length of the rectangle?\n");
        lengthOfRectangle = myScanner.nextDouble();

        System.out.println("\nWhat is the length of the rectangle?\n");
        breadthOfRectangle = myScanner.nextDouble();

        areaOfRectangle = lengthOfRectangle * breadthOfRectangle;

        System.out.printf("\nA rectangle with length of %.2f and breadth of %.2f has an area of %.2f", lengthOfRectangle, breadthOfRectangle, areaOfRectangle);

        perimeterOfRectangle(lengthOfRectangle, breadthOfRectangle);
    }

    public void perimeterOfRectangle(double lengthPassedIn, double breadthPassedIn) {
        double perimeterOfRectangle = 0;

        perimeterOfRectangle = 2 * (lengthPassedIn + breadthPassedIn);

        System.out.printf("\nA rectangle with length of %.2f and breadth of %.2f has a perimeter of %.2f", lengthPassedIn, breadthPassedIn, perimeterOfRectangle);
    }
}
