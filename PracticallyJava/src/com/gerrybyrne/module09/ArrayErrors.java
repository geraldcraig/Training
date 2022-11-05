package com.gerrybyrne.module09;

import java.util.Scanner;

public class ArrayErrors {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int numberOfEntriesBeingMade;

        int numberOfEntriesEntered = 0;
        int arrayPositionCounter = 0;
        int odometerReadingForVehicle;

        String vehiclePolicyNumber;

        System.out.println("How many entries are we wishing to make?\n");
        numberOfEntriesBeingMade = myScanner.nextInt();

        String[] odometerReadings = new String[numberOfEntriesBeingMade * 2];

        do {
            System.out.println("The current value of the counter is: " + numberOfEntriesEntered + "\n");

            System.out.println("What is the vehicle policy number?\n");
            vehiclePolicyNumber = myScanner.next();

            odometerReadings[arrayPositionCounter] = vehiclePolicyNumber;
            arrayPositionCounter++;

            System.out.println("What is the odometer reading?\n");
            odometerReadingForVehicle = myScanner.nextInt();

            odometerReadings[arrayPositionCounter] = Integer.toString(odometerReadingForVehicle);
            arrayPositionCounter++;

            numberOfEntriesEntered++;

        } while (numberOfEntriesEntered < numberOfEntriesBeingMade);

        for (String itemInTheOdometerReadingsArray : odometerReadings) {
            System.out.println("The item in the array is:\t" + itemInTheOdometerReadingsArray + "\n");
        }

        System.out.println("End of program?\n");
        myScanner.close();

    }
}
