package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExecutor extends Thread {
    public static void main(String[] args){
        int T = 100;
        AtomicInteger counter = new AtomicInteger(T);
        AtomicBoolean go = new AtomicBoolean(false);

        ExecutorService executor = Executors.newFixedThreadPool(10000);
        for (int i = 0; i < 10000; i++) {
            executor.execute(() -> {
                while (!go.get()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter.decrementAndGet();
            });
        }

        // Allow threads to start executing
        go.set(true);

        // Shutdown the executor
        executor.shutdown();

        // Wait for all tasks to complete
        while (!executor.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Counter: " + counter.get());

    }
}
