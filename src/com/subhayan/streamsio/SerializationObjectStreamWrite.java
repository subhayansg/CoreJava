package com.subhayan.streamsio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import static com.subhayan.streamsio.Student3.section;

class Student3 implements Serializable {  // makes this class serializable, this is required
    int rollNum;
    String name;
    Float avg;
    String dept;
    // also this class must have a non-parameterized constructor
    Student3() {}
    // NOTE: any static or transient member will not be serialized
    static int section;  // as this can't be instantiated
}

public class SerializationObjectStreamWrite {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student3 s = new Student3();
        s.rollNum = 20;
        s.name = "Wick";
        s.avg = 90.85f;
        s.dept = "EE";
        oos.writeObject(s);
//        System.out.println(section);
    }
}
