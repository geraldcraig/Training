package com.labs.module05;

import java.util.Scanner;

public class Lab2 {
    /*
    the total score for two tests that a student undertakes

    the average of the two scores

    the two scores will be input by the user at the console and will be accepted as String
    values by the program code (conversion will be needed)
     */

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double testOne;
        double testTwo;
        double totalScore;
        double averageScore;

        System.out.println("Enter score for test one\n");
        testOne = Double.parseDouble(myScanner.next());

        System.out.println("Enter score for test two\n");
        testTwo = Double.parseDouble(myScanner.next());

        totalScore = testOne + testTwo;
        averageScore = totalScore / 2.0;

        System.out.println("The total score for the two tests is:\t" + totalScore + "\n");

        System.out.printf("The average score for the two tests is:\t %.2f", averageScore);

        System.out.println();
    }
}
