/*
Inherits from HashTable
works on K-V of Strings only: <String, String>
 */
package com.subhayan.collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("Brand", "Lenovo");
        p.setProperty("Processor", "i5");
        p.setProperty("OS", "Windows11");
        p.setProperty("Model", "Legion");
        /*
        p.store(new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/" +
                "subhayan/collections/MyData.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/" +
                "subhayan/collections/MyData.xml"), "Laptop");
         */
        // Read properties

    }
}
