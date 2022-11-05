package com.gerrybyrne.module07;

import java.util.Scanner;

public class SelectionAnd {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int yearsOfNoClaims;
        int ageOfDriver;

        System.out.println("How many full years of no claims does the driver have?\n");

        yearsOfNoClaims = myScanner.nextInt();

        System.out.println("What is the current age of the driver?\n");

        ageOfDriver = myScanner.nextInt();

        if (!(yearsOfNoClaims > 10 || ageOfDriver > 40)) {
            System.out.println("This quote is eligible for a 10% discount");
        } else {
            System.out.println("This quote is ineligible for a discount");
        }
        myScanner.close();
    }
}
