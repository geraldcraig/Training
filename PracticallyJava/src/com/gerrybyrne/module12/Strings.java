package com.gerrybyrne.module12;

public class Strings {

    public static void main(String[] args) {

        String myVehicleInsurance = "Vehicle Insurance";
        String myHomeInsurance = "Home Insurance";
        String myInsurance = "Home Insurance";

        String myVehicleInsuranceNew = new String("Vehicle Insurance");
        String myHomeInsuranceNew = new String("Home Insurance");
        String myInsuranceNew = new String("Home Insurance");

        String myVehicleRegistration = new String("ZER 7890");

        System.out.println("The first character is: " + myVehicleRegistration.charAt(0));

        System.out.println("The first 3 characters are: " + myVehicleRegistration.substring(0, 3));

        System.out.println("The last 4 characters are: " + myVehicleRegistration.substring(4, 8));

        System.out.println("The number of characters is: " + myVehicleRegistration.length());

        String[] myVehicleRegistrations = new String[]{"ZER 7809", "ZAC 7124", "ARC 3330"};

        for (String registration : myVehicleRegistrations) {
            if (registration.startsWith("C", 2)) {
                System.out.printf("The registration %s has the letter C at position 3 %n", registration);
            } else {
                System.out.printf("The registration %s does not have the letter C at position 3 %n", registration);
            }
        }

        for (String registration : myVehicleRegistrations) {
            String[] splitRegistration = new String[2];
            splitRegistration = registration.split(" ");

            System.out.printf("Part 0 is %s %n", splitRegistration[0]);
            System.out.printf("Part 1 is %s %n", splitRegistration[1]);
        }

        String[] myMixedVehicleRegistrations = new String[]{"ZER 7809", "ZAC 7124", "ARC 3330"};

        for (String mixedRegistrationPart : myMixedVehicleRegistrations) {
            String[] splitMixedRegistration = new String[2];
            splitMixedRegistration = mixedRegistrationPart.split("[_ ,]");

            System.out.printf("Part 0 is %s %n", splitMixedRegistration[0]);
            System.out.printf("Part 1 is %s %n", splitMixedRegistration[1]);
        }
    }
}
