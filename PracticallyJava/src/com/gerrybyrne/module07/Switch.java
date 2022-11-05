package com.gerrybyrne.module07;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int yearsOfNoClaims;

        System.out.println("How many full years of no claims does the driver have?\n");

        yearsOfNoClaims = myScanner.nextInt();

        switch (yearsOfNoClaims) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Years of no claims is more than 10 but less than 16");
                break;
            case 9:
            case 10:
                System.out.println("Years of no claims is either 9 or 10");
                break;
            case 7:
            case 8:
                System.out.println("Years of no claims is either 7 or 8");
                break;
            case 5:
            case 6:
                System.out.println("Years of no claims is either 5 or 6");
                break;
            case 3:
            case 4:
                System.out.println("Years of no claims is either 3 or 4");
                break;
            default:
                System.out.println("Years of no claims is either less than 3 or greater than 15");
                break;
        }

        myScanner.close();
    }
}
