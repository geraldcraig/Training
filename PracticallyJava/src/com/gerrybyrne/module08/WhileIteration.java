package com.gerrybyrne.module08;

import java.util.Scanner;

public class WhileIteration {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String repairShopID;
        String vehiclePolicyNumber;
        String claimDate;
        double claimAmount;

        int numberOfClaimsBeingMade;
        int maximumNumberOfClaims = 5;
        int numberOfClaimsEntered = 0;

        System.out.println("How many claims are we wishing to make?\n");

        numberOfClaimsBeingMade = myScanner.nextInt();

        while (numberOfClaimsEntered < numberOfClaimsBeingMade) {

            System.out.println("The current value of the counter is :" + numberOfClaimsEntered + "\n");

            if (numberOfClaimsEntered == maximumNumberOfClaims) {
                break;
            }

            if (numberOfClaimsEntered % 2 == 0) {
                numberOfClaimsEntered++;
                continue;
            }

            System.out.println("What is our repair shop id?\n");
            repairShopID = myScanner.next();

            System.out.println("What is the vehicle policy number?\n");
            vehiclePolicyNumber = myScanner.next();

            System.out.println("What is the amount being claimed for the repair?\n");
            claimAmount = myScanner.nextDouble();

            System.out.println("What was the date of the repair?\n");
            claimDate = myScanner.next();

            System.out.println("The details entered for repair" + (numberOfClaimsEntered + 1) + " are");
            System.out.println("Repair shop id:\t" + repairShopID);
            System.out.println("Policy number:\t" + vehiclePolicyNumber);
            System.out.println("Claim amount:\t" + claimAmount);
            System.out.println("Claim date:\t" + claimDate);

            numberOfClaimsEntered++;
        }

        myScanner.close();
        System.out.println("End of program\n");
    }
}
