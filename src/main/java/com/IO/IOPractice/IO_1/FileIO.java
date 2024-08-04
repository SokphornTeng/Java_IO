package com.IO.IOPractice.IO_1;

import java.io.*;

public class FileIO {

    public static void main(String[] args) {

        String[] names = {"Aa", "Bb", "Cc"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("\nSokphron is Writing to a file");
            for(String name: names){
                writer.write("\nThis is list of name" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null){
//                System.out.println( reader.readLine() );
                System.out.println( line );
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
