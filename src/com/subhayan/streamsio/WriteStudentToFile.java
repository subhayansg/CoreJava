package com.subhayan.streamsio;

import java.io.FileOutputStream;
import java.io.PrintStream;

class Student1 {
    int rollNum;
    String name;
    String dept;
}

public class WriteStudentToFile {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student1.txt");
        PrintStream ps = new PrintStream(fos);
        Student1 s = new Student1();
        s.rollNum = 10;
        s.name ="John";
        s.dept = "CSE";
        ps.println(s.rollNum);
        ps.println(s.name);
        ps.println(s.dept);
    }
}