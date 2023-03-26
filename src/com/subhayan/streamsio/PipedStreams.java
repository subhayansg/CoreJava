package com.subhayan.streamsio;

import java.io.*;

class Producer extends Thread {
    OutputStream os;
    public Producer(OutputStream os) {
        this.os = os;
    }

    public void run() {
        int count = 1;
        while(true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Produced: " + count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;
    public Consumer(InputStream is) {
        this.is = is;
    }

    public void run() {
        int x;
        while(true) {
            try {
                x = is.read();
                System.out.println("Consumed: " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class PipedStreams {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            pis.connect(pos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
