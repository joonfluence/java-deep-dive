package org.grammar.thread;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
    }
}
