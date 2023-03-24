package com.subhayan.streamsio;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayWriteStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);  // creates a byte array of size 20
        bos.write('a');
        bos.write('b');
        byte[] b = bos.toByteArray();
        for(byte x: b)
            System.out.print((char) x);
        // write the above byte array stream to a file
        bos.writeTo(new FileOutputStream("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Test.txt"));
        bos.close();
    }
}
