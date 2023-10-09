package org.synchronization;

import java.time.LocalDateTime;

public class VolatileWithSyncTest {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        noSync();
        //sync();
    }

    private static void noSync() throws InterruptedException {
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
    private static void sync() throws InterruptedException {
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