package com.gerrybyrne.module11;

import java.util.Scanner;

public class ClaimDetails {

    Scanner myScanner = new Scanner(System.in);

    int numberOfClaimsBeingMade;

    String repairShopID;
    String vehiclePolicyNumber;
    double claimAmount;
    String claimDate;
    String message = "";
    String[] repairShopClaims = new String[8];
    double totalofallclaims;
    double vatamount;
    int numberOfClaimsEntered = 0;
    int arrayPositionCounter = 0;

    public ClaimDetails(String claimDate) {
        this.claimDate = claimDate;
    }

    public ClaimDetails(String claimDate, String message) {
        this.claimDate = claimDate;
        this.message = message;
    }

    public int HowManyClaimsAreBeingMade() {
        System.out.println("How many claims are we wishing to make?\n");
        return myScanner.nextInt();
    }

    public void CurrentValueOfCounter() {
        System.out.println("The current value of the counter is: " + numberOfClaimsEntered + "\n");
    }

    public String ReadTheRepairShopID() {
        System.out.println("What is our repair shop id?\n");
        repairShopID = myScanner.next();

        return repairShopID;
    }

    public void WriteRepairShopIdToTheArray() {
        repairShopClaims[arrayPositionCounter] = repairShopID;
        arrayPositionCounter++;
    }

    public String ReadTheVehiclePolicyNumber() {
        System.out.println("What is the vehicle policy number?\n");
        vehiclePolicyNumber = myScanner.next();

        return vehiclePolicyNumber;
    }

    public void WriteVehiclePolicyNumberToTheArray() {
        repairShopClaims[arrayPositionCounter] = vehiclePolicyNumber;
        arrayPositionCounter++;
    }

    public double ReadTheAmountBeingClaimed() {
        System.out.println("What is the amount being claimed for the repair?\n");
        claimAmount = myScanner.nextDouble();

        AccumulateClaimAmount(claimAmount);

        return claimAmount;
    }

    public void WriteClaimAmountToTheArray() {
        repairShopClaims[arrayPositionCounter] = Double.toString(claimAmount);
        arrayPositionCounter++;
    }

    public String ReadTheRepairDate() {
        System.out.println("What was the date of the repair?\n");
        claimDate = myScanner.next();

        return claimDate;
    }

    public void WriteRepairDateToTheArray() {
        repairShopClaims[arrayPositionCounter] = claimDate;
        arrayPositionCounter++;
    }

    public void DisplayAllItemsInTheArray() {
        for (String itemInTheClaimsArray : repairShopClaims) {
            System.out.println("The item in the array is:\t" + itemInTheClaimsArray + "\n");
        }
    }

    public double AccumulateClaimAmount(double claimamountpassedin) {
        totalofallclaims = totalofallclaims + claimamountpassedin;
        return totalofallclaims;
    }

    public double CalculateVATAmount(double totalvalueofclaimspassedin) {
        vatamount = totalvalueofclaimspassedin - (totalvalueofclaimspassedin / 1.20);
        return vatamount;
    }

    public void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassesIn) {
        System.out.println("\nInvoice for vehicle repairs\n");
        System.out.println("Nett claim\t" + (totalofallclaims - vatamount) + "\n");
        System.out.println("VAT amount\t" + vatamount + "\n");
        System.out.println("Total amount\t" + totalofallclaims + "\n");

        System.out.println(message);
    }

    /*public void DisplayInvoiceReceipt(double totalvalueofclaimspassedin, double vatPassesIn, String messagePassedIn) {
        System.out.println("*******************************************************");
        System.out.println("\nInvoice for vehicle repairs\n");
        System.out.println("Nett claim\t" + (totalofallclaims - vatamount) + "\n");
        System.out.println("VAT amount\t" + vatamount + "\n");
        System.out.println("Total amount\t" + totalofallclaims + "\n");
        System.out.println(messagePassedIn);
        System.out.println("*******************************************************");
    } */

}
