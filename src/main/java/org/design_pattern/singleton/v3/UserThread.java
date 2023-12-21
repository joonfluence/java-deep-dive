package org.design_pattern.singleton.v3;

public class UserThread extends Thread {

    public UserThread(String name) {
        super(name);
    }

    public void run(){
        Printer.print(Thread.currentThread().getName() + " print using " + ".");
    }
}

class Client {
    private static final int THREAD_NUM = 5;
    public static void main(String[] args) {
        UserThread[] user = new UserThread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            user[i] = new UserThread((i + 1) + "-thread");
            user[i].start();
        }
    }
}
