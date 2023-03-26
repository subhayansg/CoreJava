package com.subhayan.streamsio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadStudentFromFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student1.txt");
// FileInputStream cannot read Strings, so we need BufferedReader which has readLine method
// But we need to convert the stream to reader using InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student1 s = new Student1();  // part of WriteStudentToFile
        s.rollNum = Integer.parseInt(br.readLine());  // convert String to Integer
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println(s.rollNum);
        System.out.println(s.name);
        System.out.println(s.dept);
    }
}