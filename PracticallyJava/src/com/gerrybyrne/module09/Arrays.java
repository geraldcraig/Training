package com.gerrybyrne.module09;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String[] repairShopClaims = new String[8];

        String repairShopID;
        String vehiclePolicyNumber;
        double claimAmount;
        String claimDate;
        int numberOfClaimsBeingMade;
        int numberOfClaimsEntered = 0;
        int arrayPositionCounter = 0;

        System.out.println("How many claims are we wishing to make?\n");
        numberOfClaimsBeingMade = myScanner.nextInt();

        do {
            System.out.println("The current value of the counter is: " + numberOfClaimsEntered + "\n");

            System.out.println("What is our repair shop id?\n");
            repairShopID = myScanner.next();

            repairShopClaims[arrayPositionCounter] = repairShopID;
            arrayPositionCounter++;

            System.out.println("What is the vehicle policy number?\n");
            vehiclePolicyNumber = myScanner.next();

            repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
            arrayPositionCounter++;

            System.out.println("What is the amount being claimed for the repair?\n");
            claimAmount = myScanner.nextDouble();

            repairShopClaims[arrayPositionCounter] = Double.toString(claimAmount);
            arrayPositionCounter++;

            System.out.println("What was the date of the repair?\n");
            claimDate = myScanner.next();

            repairShopClaims[arrayPositionCounter] = claimDate;
            arrayPositionCounter++;

            numberOfClaimsEntered++;

        } while (numberOfClaimsEntered < numberOfClaimsBeingMade);

        for (String itemInTheClaimsArray : repairShopClaims) {
            System.out.println("The item in the array is:\t" + itemInTheClaimsArray + "\n");
        }

        myScanner.close();
    }
}
