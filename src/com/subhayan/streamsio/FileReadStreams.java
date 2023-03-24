package com.subhayan.streamsio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadStreams {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Test.txt")) {
            byte[] b = new byte[fis.available()];   // available gives the bytes present in the stream
            fis.read(b);
            String s = new String(b);
            System.out.println(s);
            /* Read byte by byte
            int x;
            while((x = fis.read()) != -1) {    // when nothing else is there to read, -1
                System.out.println((char) x);
            }
             */
        } catch (FileNotFoundException e) {
            System.out.println("The given file is not found! " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
