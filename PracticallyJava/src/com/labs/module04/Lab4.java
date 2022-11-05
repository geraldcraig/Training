package com.labs.module04;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String creditCardNumber;
        byte cardExpiryMonth;
        byte cardExpiryYear;
        byte cardIssueNumber;
        int cardSecurityCode;
        String nameOnCard;

        System.out.println("Input credit card number");
        creditCardNumber = myScanner.next();

        System.out.println("Input card expiry month");
        cardExpiryMonth = myScanner.nextByte();

        System.out.println("Input card expiry year");
        cardExpiryYear = myScanner.nextByte();

        System.out.println("Input card issue number");
        cardIssueNumber = myScanner.nextByte();

        System.out.println("Input card security code");
        cardSecurityCode = myScanner.nextInt();

        System.out.println("Input name on card");
        nameOnCard = myScanner.next();

        System.out.println("Credit card number is:\t" + creditCardNumber);
        System.out.println("Card expiry date is:\t" + cardExpiryMonth);
        System.out.println("Card expiry year is:\t" + cardExpiryYear);
        System.out.println("Card issue number is:\t" + cardIssueNumber);
        System.out.println("Card security code is:\t" + cardSecurityCode);
        System.out.println("Name on card is:\t" + nameOnCard);

        myScanner.close();
    }
}
