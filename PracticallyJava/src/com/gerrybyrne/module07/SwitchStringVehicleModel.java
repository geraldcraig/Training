package com.gerrybyrne.module07;

import java.util.Scanner;

public class SwitchStringVehicleModel {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String vehicleModel;
        String vehicleManufacturer;

        System.out.println();
        System.out.println("What is the model of the vehicle?\n");

        vehicleModel = myScanner.next();

        switch (vehicleModel) {
            case "Edge":
            case "Fiesta":
            case "Focus":
            case "Kuga":
            case "Mondeo":
            case "Mustang":
                vehicleManufacturer = "Ford";
                break;
            case "Astra":
            case "Corsa":
            case "Insignia":
            case "Viva":
                vehicleManufacturer = "Vauxhall";
                break;
            case "Altima":
            case "Juke":
            case "Sentra":
                vehicleManufacturer = "Nissan";
                break;
            case "C-Class":
            case "E-Class":
            case "S-Class":
            case "GLA":
            case "GLC":
            case "GLE":
                vehicleManufacturer = "Mercedes Benz";
                break;
            default:
                vehicleManufacturer = "unknown";
                break;
        }

        System.out.println("\nThe  " + vehicleModel + " manufacturer is " + vehicleManufacturer);
        System.out.format("\nThe %s manufacturer is %s", vehicleModel, vehicleManufacturer);

        myScanner.close();
    }
}
