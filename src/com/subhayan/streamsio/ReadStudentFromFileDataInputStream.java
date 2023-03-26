package com.subhayan.streamsio;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadStudentFromFileDataInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava" +
                "/src/com/subhayan/streamsio/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student2 s = new Student2();  // part of WriteStudentToFileDataOutputStream
        s.rollNum = dis.readInt();
        s.name = dis.readUTF();
        s.avg = dis.readFloat();
        s.dept = dis.readUTF();
        System.out.println(s.rollNum);
        System.out.println(s.name);
        System.out.println(s.avg);
        System.out.println(s.dept);
    }
}
