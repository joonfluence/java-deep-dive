package org.synchronization;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class SyncTest {
    public static void main(String[] args) {
        SyncTest sync = new SyncTest();
        Thread threadA = new Thread(() -> {
            System.out.println("threadA 시작 " + LocalDateTime.now());
            sync.syncMethod1("스레드1");
            System.out.println("threadA 종료 " + LocalDateTime.now());
        });
        Thread threadB = new Thread(() -> {
            System.out.println("threadB 시작 " + LocalDateTime.now());
            sync.syncMethod2("스레드2");
            System.out.println("threadB 종료 " + LocalDateTime.now());
        });
        Thread threadC = new Thread(() -> {
            System.out.println("threadC 시작 " + LocalDateTime.now());
            sync.method3("스레드3");
            System.out.println("threadC 종료 " + LocalDateTime.now());
        });
        threadA.start();
        threadB.start();
        threadC.start();
    }

    private synchronized void syncMethod1(String msg){
        System.out.println(msg + "의 syncMethod1 실행중" + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private synchronized void syncMethod2(String msg){
        System.out.println(msg + "의 syncMethod2 실행중" + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void method3(String msg) {
        System.out.println(msg + "의 method3 실행중" + LocalDateTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
