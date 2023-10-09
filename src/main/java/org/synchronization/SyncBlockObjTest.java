package org.synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SyncBlockObjTest {

    private final Object o1 = new Object();
    private final Object o2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        SyncBlockObjTest block = new SyncBlockObjTest();

        Thread thread1 = new Thread(() -> {
            System.out.println("스레드1 시작 " + LocalDateTime.now());
            block.syncBlockMethod1("스레드1");
            System.out.println("스레드1 종료 " + LocalDateTime.now());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("스레드2 시작 " + LocalDateTime.now());
            block.syncBlockMethod2("스레드2");
            System.out.println("스레드2 종료 " + LocalDateTime.now());
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("스레드3 시작 " + LocalDateTime.now());
            block.syncBlockMethod3("스레드3");
            System.out.println("스레드3 종료 " + LocalDateTime.now());
        });

        Thread thread4 = new Thread(() -> {
            System.out.println("스레드4 시작 " + LocalDateTime.now());
            block.syncBlockMethod4("스레드4");
            System.out.println("스레드4 종료 " + LocalDateTime.now());
        });

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();
    }

    private void syncBlockMethod1(String msg) {
        synchronized (o1) {
            System.out.println(msg + "의 syncBlockMethod1 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void syncBlockMethod2(String msg) {
        synchronized (o2) {
            System.out.println(msg + "의 syncBlockMethod2 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void syncBlockMethod3(String msg) {
        synchronized (o1) {
            System.out.println(msg + "의 syncBlockMethod3 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void syncBlockMethod4(String msg) {
        synchronized (o2) {
            System.out.println(msg + "의 syncBlockMethod4 실행중" + LocalDateTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
