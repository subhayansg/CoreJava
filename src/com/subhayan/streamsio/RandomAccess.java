package com.subhayan.streamsio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("C:/Users/Subhayan/Desktop/intellijJava" +
                    "/src/com/subhayan/streamsio/Random_Test.txt", "rw");  // read write mode, can be r - read only, w - write only
            // Random_Test has ABCDEFGHIJ
            System.out.println((char) raf.read());  // A
            System.out.println((char) raf.read());  // B
            System.out.println((char) raf.read());  // C, now the pointer points to D
            raf.write('d');  // Random_Test now has ABCdEFGIJ, file pointer now points to E
            System.out.println((char) raf.read());  // E
            raf.skipBytes(3); // skips F, G, H, pointer points to I
            System.out.println((char) raf.read());  // I, pointer points to J
            // Now I want to print d, but pointer is at J
            raf.seek(3); // d is at position 3, this resets the pointer to 3
            System.out.println((char) raf.read());  // d, pointer points to E
            System.out.println((char) raf.read());  // E, pointer points to F
            System.out.println(raf.getFilePointer());  // F is at 5
            raf.seek(raf.getFilePointer() + 2);  // pointer moves to 7, H
            System.out.println((char) raf.read()); // H
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
