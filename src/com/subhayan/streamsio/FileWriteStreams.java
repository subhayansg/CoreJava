package com.subhayan.streamsio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteStreams {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Test.txt")) {
                String str1 = "Store in a file!";
                fos.write(str1.getBytes());
//                fos.close();
        } catch (FileNotFoundException e) {
                System.out.println("The given file is not found! " + e);
        } catch (IOException e) {
                throw new RuntimeException(e);
        }
    }
}
