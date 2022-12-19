package com.gerrybyrne.module11;

import java.util.Scanner;

public class CircleFormulae {

    Scanner myScanner = new Scanner(System.in);

    public void areaOfCircle() {

        double radiusLength = 0;
        double areaOfCircle = 0;

        System.out.println("What is the length of the radius of the circle?\n");

        radiusLength = myScanner.nextDouble();

        areaOfCircle = Math.PI * radiusLength * radiusLength;

        System.out.printf("\nA circle with radius %.2f has an area of %.2f", radiusLength, areaOfCircle);

        circumferenceOfCircle(radiusLength);

    }

    public void circumferenceOfCircle(double radiusOfCirclePassedIn) {
        double circumferenceOfCircle = 0;
        circumferenceOfCircle = 2 * Math.PI * radiusOfCirclePassedIn;

        System.out.printf("\nA circle with radius %.2f has a circumference of %.2f", radiusOfCirclePassedIn, circumferenceOfCircle);
    }
}
