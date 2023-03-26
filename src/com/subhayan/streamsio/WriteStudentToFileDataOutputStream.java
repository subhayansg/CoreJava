package com.subhayan.streamsio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student2 {
    int rollNum;
    String name;
    Float avg;
    String dept;
}

public class WriteStudentToFileDataOutputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        Student2 s = new Student2();
        s.rollNum = 10;
        s.name ="John";
        s.avg = 80.85f;
        s.dept = "CSE";
        dos.writeInt(s.rollNum);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);
        dos.close();
        fos.close();
    }
}
