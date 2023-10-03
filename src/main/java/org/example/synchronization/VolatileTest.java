package org.example.synchronization;

import java.time.LocalDateTime;

public class VolatileTest {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start = " + stopRequested + LocalDateTime.now());
        Thread backgroundThread = new Thread(() -> {
            Integer i = 0;
            while (!stopRequested) {
                synchronized (i){
                    i++;
                }
            }
        });
        backgroundThread.start();

        Thread.sleep(1000);
        stopRequested = true;
        System.out.println("end = " + stopRequested + LocalDateTime.now());
    }
}
