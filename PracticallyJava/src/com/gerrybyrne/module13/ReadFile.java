package com.gerrybyrne.module13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {

        String filePath = "txtOutputFile.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Welcome to Java File handling");
            bufferedWriter.newLine();
            bufferedWriter.write("We can write text to files and databases");
            bufferedWriter.newLine();
            bufferedWriter.write("We can read text from files and databases");

            bufferedWriter.close();

            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("Error writing file " + filePath + "");
        }
    }
}
