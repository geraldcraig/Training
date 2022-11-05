// Program Description:     A Java program to perform arithmetical operations
// Author:                  Gerry Byrne
// Date of creation:        20/10/2022

package com.gerrybyrne.module06;

import java.util.Scanner;

public class QuoteArithmetic {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

    /* We wll set up our variables that will be used in the mathematical
    calculation used to produce an insurance quotation for a vehicle.
    First we will set up the variables that will hold the user input and
    that will be used in calculating the quote. */

        int vehicleAgeInYears;
        int vehicleCurrentMileage;

    /* For the quotation we will use 10000 kilometres as a baseline for
    calculating a mileage factor. If the average kilometres travelled
    per year is above the base mileage of 10000 the mileage factor will
    be above 1, if the average kilometres travelled per year is lower
    than the base mileage of 10000 the mileage factor will be below 1. */

        double quoteAverageExpectedKilometres = 10000;

    /* For the quotation we wll use £100 as a base figure (this is just
    an example) and this figure will be multiplied by the mileage and
    age factors. */

        double quoteBaseRate = 100.00;

    /* For the quotation we will use 10 as a base figure for the age of
    the vehicle (this is just an example). If the vehicle is older than
    10 years, the age factor will be above 1. If the vehicle is younger
    than 10 years the age factor wil be below 1. */

        int quoteBaseAge = 10;

    /* This variable will be used to hold the value of the age factor */

        double quoteAgeFactor;

        double quoteAgeFactorPremium;

        double quoteMileageFactor;

        double quoteMileageFactorPremium;

        double quoteDiscount;

        double quoteAmountForPremium;

        double quoteFinalAmountForPremium;

        System.out.println();
        System.out.println("------ Car Quotation Application ------");
        System.out.println("\tCar\tInsurance\tApplication\n");
        System.out.println();
        System.out.println("What is the age, in full years, of the vehicle?\n");

        /* Perform the conversion from string to int as we will use the age of
        the vehicle in our calculation, and it needs to be numeric. */

        vehicleAgeInYears = (int) (myScanner.nextInt());

        /* Perform the conversion from string to double as we will use the age of
        the vehicle in our calculation, and it needs to be numeric. Example: For
        a 5-year-old car the factor is 10/5 = 2. */

        quoteAgeFactor = (double) (quoteBaseAge) / (double) (vehicleAgeInYears);

        /* The quote amount based on the age is £100 multiplied by the age factor
        Example £100 * 2 = £200. */

        quoteAgeFactorPremium = quoteBaseRate * quoteAgeFactor;

        /* Ask the user for the number of kilometres on the odometer */

        System.out.println("What is the current mileage (n km) of the vehicle?\n");
        vehicleCurrentMileage = (int) (myScanner.nextInt());

        quoteMileageFactor = (vehicleCurrentMileage / vehicleAgeInYears) / quoteAverageExpectedKilometres;

        quoteMileageFactor = Math.sqrt(quoteMileageFactor);

        quoteMileageFactorPremium = quoteBaseRate * quoteMileageFactor;

        quoteAmountForPremium = quoteAgeFactorPremium + quoteMileageFactorPremium;

        quoteDiscount = (1 / (double) vehicleAgeInYears) * quoteAmountForPremium;

        quoteFinalAmountForPremium = quoteAmountForPremium - quoteDiscount;

        System.out.println("*************************************************\n");
        System.out.println("Quotation price is for 1 year starting today  \n");
        System.out.println("*************************************************\n");
        System.out.println("The age of the vehicle is:\t\t\t\t" + vehicleAgeInYears);
        System.out.format("The age factor for this vehicle is: %.2f", quoteAgeFactor);
        System.out.println();
        System.out.println("The average kilometres per year is: \t" + (vehicleCurrentMileage / vehicleAgeInYears));
        System.out.format("The mileage factor is:\t\t\t\t\t%.16f", quoteMileageFactor);
        System.out.println();
        System.out.format("The quotation is:\t\t\t\t\t\t£%.2f", quoteAmountForPremium);
        System.out.println();
        System.out.format("The discount is:\t\t\t\t\t\t£%.2f", quoteDiscount);
        System.out.println();
        System.out.format("The final discounted amount is:\t\t£%.2f%n", quoteFinalAmountForPremium);
        System.out.println("*************************************************\n");

        //myScanner.next();
        myScanner.close();

    } // End of main() method
} // End of Arithmetic class
