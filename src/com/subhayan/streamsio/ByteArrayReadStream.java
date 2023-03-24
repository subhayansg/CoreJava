package com.subhayan.streamsio;

import java.io.ByteArrayInputStream;

public class ByteArrayReadStream {
    public static void main(String[] args) {
        byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b); // considering the byte array b to be a stream
        // read whole byte array
        String s = new String(bis.readAllBytes());
        System.out.println(s);
        /* read the data byte by byte
        int x;
        while((x = bis.read()) != -1) {
            System.out.print((char) x);
        }
        try {
            bis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */
    }
}
