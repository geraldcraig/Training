package com.gerrybyrne.module07;

import java.util.Scanner;

public class Selection {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int yearsOfNoClaims;

        System.out.println("How many full years of no claims does the driver have?\n");
        yearsOfNoClaims = myScanner.nextInt();

        if (yearsOfNoClaims > 10) {
            System.out.println("Years of no claims is more than 10");
        } else if (yearsOfNoClaims > 8) {
            System.out.println("Years of no claims is either 9 or 10");
        } else if (yearsOfNoClaims > 6) {
            System.out.println("Years of no claims is either 7 or 8");
        } else if (yearsOfNoClaims > 4) {
            System.out.println("Years of no claims is either 5 or 6");
        } else if (yearsOfNoClaims > 2) {
            System.out.println("Years of no claims is either 3 or 4");
        } else {
            System.out.println("Years of no claims is 2,1,0\n or indeed a negative number of years \n because of a penalty being enforced on our policy");
        }

        myScanner.close();
    }
}
