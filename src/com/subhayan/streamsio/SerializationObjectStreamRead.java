package com.subhayan.streamsio;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationObjectStreamRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student3 s;  // part of SerializationObjectStreamWrite
        s = (Student3) ois.readObject();
        System.out.println(s.rollNum);
        System.out.println(s.name);
        System.out.println(s.avg);
        System.out.println(s.dept);
    }
}
