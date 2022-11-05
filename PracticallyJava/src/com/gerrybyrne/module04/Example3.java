/*
The package is simply an area that holds our class.
This package has used the . to separate sections of the package name.
The parts essentially represent folders within our project.
Package names are by tradition all small letters.
*/

package com.gerrybyrne.module04;

// Program Description:  A simple Java program to output text and read input
// Author:               Gerry Byrne
// Date of creation:     19/10/2022

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// This is our only class, and it will contain the Main method
public class Example3 {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
    /*
    In this section we will add the variables we will use throughout the program
    code. These are variables that are going to be of a specific data type. Once
    we declare a variable and have said what its data type is, we cannot change
    the variables data type.

    The data type is immutable, it cannot be changed over time. First we will add
    a variable called vehicleManufacturer of data type string.
    */
        String vehicleManufacturer;
        String vehicleModel;
        String vehicleColour;
        int vehicleAgeInYears;
        double vehicleEstimateCurrentPrice;
        int vehicleCurrentMileage;
        String dateOfBirthOfMainDriver;

        System.out.println();
        System.out.println("------- Car Quotation Application -------");
        System.out.println("\tCar\tInsurance\tApplication\n");
        System.out.println();
        System.out.println("Type the vehicle manufacturer and press the enter key");
        System.out.println();

     /*
     The next line of code tells the program to wait for the user to input something.
     When the user
     */
        vehicleManufacturer = myScanner.next();

     /*
     The next line of code tells
     */

        System.out.println("Your car manufacturer is recorded as " + vehicleManufacturer);
     /*
     In the next three lines
     */
        System.out.println("What is the model of the vehicle?\n");

        vehicleModel = myScanner.next();

        System.out.println("You have told us that the vehicle model is " + vehicleModel);

        System.out.println("What is the colour of the vehicle?\n");
        vehicleColour = myScanner.next();

        System.out.println("You have told us that the vehicle colour is " + vehicleColour);

        System.out.println("What is the age, in full years, of the vehicle?\n");
        vehicleAgeInYears = myScanner.nextInt();

        System.out.println("You have told us that the vehicle age is " + vehicleAgeInYears);

        System.out.println("What is the estimated value of the vehicle?\n");
        vehicleEstimateCurrentPrice = myScanner.nextDouble();

        System.out.println("You have told us that the estimated vehicle price is £" + vehicleEstimateCurrentPrice);

        System.out.println("What is the current mileage (in km) of the vehicle?\n");
        vehicleCurrentMileage = myScanner.nextInt();
        System.out.println("You have told us that the vehicle mileage is " + vehicleCurrentMileage + " km");

        myScanner.nextLine();

        System.out.println("What is the date of birth (dd-mm-yyyy) of the main driver of the vehicle?\n");

        dateOfBirthOfMainDriver = myScanner.nextLine();

        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd-mm-yyyy");

        try {
            Date dateOfBirthOfMainDriverInDateFormat = myDateFormat.parse(dateOfBirthOfMainDriver);
            System.out.println("You have told us that the main driver was born on " + dateOfBirthOfMainDriverInDateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println();
        myScanner.close();
    } // End of main() method
} // End of Example3 class


