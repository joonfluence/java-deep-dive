package org.example.synchronization;

import java.time.LocalDateTime;

public class VolatileTest {
    private volatile static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        sync();
    }

    private static void sync() throws InterruptedException {
        System.out.println("start = " + stopRequested + LocalDateTime.now());
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
            }
        });
        backgroundThread.start();

        Thread.sleep(1000);
        stopRequested = true;
        System.out.println("end = " + stopRequested + LocalDateTime.now());
    }
}