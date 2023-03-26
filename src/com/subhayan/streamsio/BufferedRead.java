package com.subhayan.streamsio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Test2.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            // read the content of the file using BufferedInputStream, byte by byte
            int x;
            while((x = bis.read()) != -1) {
                System.out.print((char) x);
            }

            // fis doesn't support marking, bis supports marking
            System.out.println("\nfis supports marking: " + fis.markSupported());
            System.out.println("bis supports marking: " + bis.markSupported());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
