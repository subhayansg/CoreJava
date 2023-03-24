package com.subhayan.streamsio;

import java.io.*;

public class CharArrayWriteStream {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter(20);
        char c = 'm';
        int len = 10, j = 0;
        while(j <= len) {
            charArrayWriter.write(c);
            c++;
            j++;
        }
        System.out.println(charArrayWriter.toCharArray());
        // write to file
        try {
            charArrayWriter.writeTo(new FileWriter("C:/Users/Subhayan/Desktop/intellijJava/src/com/subhayan/streamsio/Test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
