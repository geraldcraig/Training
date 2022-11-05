package com.gerrybyrne.module10;

import java.util.Scanner;

public class MethodsVoid {

    static Scanner myScanner = new Scanner(System.in);

    static String[] repairShopClaims = new String[8];
    static String repairShopID;
    static String vehiclePolicyNumber;
    static double claimAmount;
    static String claimDate;
    static int numberOfClaimsBeingMade;
    static int numberOfClaimsEntered = 0;
    static int arrayPositionCounter = 0;

    public static void main(String[] args) {

        HowManyClaimsAreBeingMade();

        do {
            CurrentValueOfCounter();
            ReadTheRepairShopID();
            WriteRepairShopIdToTheArray();
            ReadTheVehiclePolicyNumber();
            WriteVehiclePolicyNumberToTheArray();
            ReadTheAmountBeingClaimed();
            WriteClaimAmountToTheArray();
            ReadTheRepairDate();
            WriteRepairDateToTheArray();

            numberOfClaimsEntered++;
        } while (numberOfClaimsEntered < numberOfClaimsBeingMade);

        DisplayAllItemsInTheArray();

    }

    public static void HowManyClaimsAreBeingMade() {
        System.out.println("How many claims are we wishing to make?\n");
        numberOfClaimsBeingMade = myScanner.nextInt();
    }

    public static void CurrentValueOfCounter() {
        System.out.println("The current value of the counter is: " + numberOfClaimsEntered + "\n");
    }

    public static void ReadTheRepairShopID() {
        System.out.println("What is our repair shop id?\n");
        repairShopID = myScanner.next();
    }

    public static void WriteRepairShopIdToTheArray() {
        repairShopClaims[arrayPositionCounter] = repairShopID;
        arrayPositionCounter++;
    }

    public static void ReadTheVehiclePolicyNumber() {
        System.out.println("What is the vehicle policy number?\n");
        vehiclePolicyNumber = myScanner.next();
    }

    public static void WriteVehiclePolicyNumberToTheArray() {
        repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
        arrayPositionCounter++;
    }

    public static void ReadTheAmountBeingClaimed() {
        System.out.println("What is the amount being claimed for the repair?\n");
        claimAmount = myScanner.nextDouble();
    }

    public static void WriteClaimAmountToTheArray() {
        repairShopClaims[arrayPositionCounter] = String.valueOf(claimAmount);
        arrayPositionCounter++;
    }

    public static void ReadTheRepairDate() {
        System.out.println("What was the date of the repair?\n");
        claimDate = myScanner.next();
    }

    public static void WriteRepairDateToTheArray() {
        repairShopClaims[arrayPositionCounter] = claimDate;
        arrayPositionCounter++;
    }

    public static void DisplayAllItemsInTheArray() {
        for (String itemInTheClaimsArray : repairShopClaims) {
            System.out.println("The item in the array is:\t" + itemInTheClaimsArray + "\n");
        }
    }

}
