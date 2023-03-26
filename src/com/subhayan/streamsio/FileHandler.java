package com.subhayan.streamsio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHandler {
    public static void main(String[] args) {
        File f = new File("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/");
        System.out.println(f.isDirectory());
        // list all files and folders in the directory
        String[] s = f.list();
        for(String str: s)
            System.out.println(str);
        // List all files in the directory, gets fully qualified paths
        File[] files = f.listFiles();
        for(File fl: files) {
            System.out.print(fl.getName() + " ");  // name of the file
            System.out.println(fl.getPath());  // fully qualified path
        }
        // Make a file read only
        File fReadOnly = new File("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Random_Test.txt");
        fReadOnly.setReadOnly();
        try {
            FileOutputStream fos = new FileOutputStream(fReadOnly);  // This will throw Access is Denied error.
        } catch (FileNotFoundException e) {
            System.out.println("Access is denied. " + e);;
        }
    }
}
