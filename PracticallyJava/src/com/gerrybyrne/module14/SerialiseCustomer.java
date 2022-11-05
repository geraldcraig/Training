package com.gerrybyrne.module14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialiseCustomer {

    public static void main(String[] args) {

        Customer myCustomerObject = new Customer(123456, 45, "Gerry", "1 Any Street,Belfast, BT1 ANY", 10);

        try {
            FileOutputStream fileOutputStreamForData = new FileOutputStream("CustomerSerialisedData.ser");

            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);

            objectOutputStreamForData.writeObject(myCustomerObject);

            objectOutputStreamForData.close();

            fileOutputStreamForData.close();

        } catch (IOException exceptionGenerated) {
            System.out.println(exceptionGenerated);
        }
    }
}
