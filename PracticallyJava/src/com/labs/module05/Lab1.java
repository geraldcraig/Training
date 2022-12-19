package com.labs.module05;

import java.util.Scanner;

public class Lab1 {
    /*
    Write a Java console application that will calculate and display the number of points accumulated by a
    sports team during their season. The program should ask the user to input the number of games won,
    the number of games drawn and the number of games lost. The program should total the number of games
    played and calculate the number of points won based on the facts that 3 points are given for a win,
    1 point is given for a draw and 0 points are given for a lost game. Display the number of games played
    and the number of points accumulated.
     */

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int gamesWon;
        int gamesDrawn;
        int gamesLost;
        int totalGamesPlayed;
        int totalPoints;

        System.out.println("Enter number of games won\n");
        gamesWon = myScanner.nextInt();

        System.out.println("Enter number of games drawn\n");
        gamesDrawn = myScanner.nextInt();

        System.out.println("Enter number of games lost\n");
        gamesLost = myScanner.nextInt();

        totalGamesPlayed = gamesWon + gamesDrawn + gamesLost;

        totalPoints = (gamesWon * 3) + gamesDrawn;

        System.out.println("Total number of games played was:\t" + totalGamesPlayed + "\n");

        System.out.println("Total number of points accumulated was:\t" + totalPoints + "\n");

        myScanner.close();
    }
}
