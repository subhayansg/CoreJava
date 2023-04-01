package com.subhayan.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizers {
    public static void main(String[] args) {
        String data = "name=Subhayan;address=Gopinagar;location=Yuba Sangha;bike=Ntorq";
        StringTokenizer stk = new StringTokenizer(data, "=;");
        while (stk.hasMoreTokens()) {
            String s = stk.nextToken();
            System.out.println(s);
        }
        // Read Token.txt
        try {
            FileInputStream fis = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava/src/" +
                    "com/subhayan/collections/Token.txt");
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String token = new String(b);
            StringTokenizer stk2 = new StringTokenizer(token, "="); // \n need not be included in the list of delimiters
            while (stk2.hasMoreTokens())
                System.out.println(stk2.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Read Numbers.txt and add the numbers to an ArrayList
        try {
            FileInputStream fis2 = new FileInputStream("C:/Users/Subhayan/Desktop/intellijJava/src/" +
                    "com/subhayan/collections/Numbers.txt");
            byte[] b2 = new byte[fis2.available()];
            fis2.read(b2);
            String token2 = new String(b2);
            StringTokenizer stk3 = new StringTokenizer(token2, ",");
            ArrayList<Integer> al = new ArrayList<>();
            while (stk3.hasMoreTokens()) {
                String s = stk3.nextToken();
                al.add(Integer.parseInt(s));
            }
            System.out.println(al);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
