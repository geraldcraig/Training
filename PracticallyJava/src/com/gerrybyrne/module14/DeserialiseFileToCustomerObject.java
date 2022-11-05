package com.gerrybyrne.module14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialiseFileToCustomerObject {

    public static void main(String[] args) {

        try {

            Customer myCustomer = null;

            FileInputStream fileInputStreamForData = new FileInputStream("CustomerSerialisedData.ser");

            ObjectInputStream objectInputStreamForData = new ObjectInputStream(fileInputStreamForData);

            myCustomer = (Customer) objectInputStreamForData.readObject();

            System.out.println("Customer Details");
            System.out.println("Customer Name: " + myCustomer.getCustomerName());
            System.out.println("Customer Age: " + myCustomer.getCustomerAge());
            System.out.println("Customer Account No: " + myCustomer.getCustomerAccountNumber());
            System.out.println("Customer Address: " + myCustomer.getCustomerAddress());
            System.out.println("Customer Years a Customer: " +myCustomer.getCustomerYearsWithCompany());

            objectInputStreamForData.close();

            fileInputStreamForData.close();

        } catch (Exception exceptionGenerated) {
            System.out.println(exceptionGenerated);
        }
    }
}
