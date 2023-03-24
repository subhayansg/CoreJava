package com.subhayan.streamsio;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReadStream {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader charArrayReader = new CharArrayReader(c);
        try {
            int x;
            while((x = charArrayReader.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
