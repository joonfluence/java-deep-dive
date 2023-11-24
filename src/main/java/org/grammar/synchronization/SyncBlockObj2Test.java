package org.grammar.synchronization;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class SyncBlockObj2Test {

    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public static void main(String[] args) throws InterruptedException {
        SyncBlockObj2Test blockObj2Test = new SyncBlockObj2Test();
        blockObj2Test.methodA("methodA");
        blockObj2Test.methodB("methodB");
    }

    public synchronized void methodA(String msg) {
        synchronized(lockA) {
            // do something
            System.out.println("methodA의 syncBlockMethod1 시작" + LocalDateTime.now());
            try {
                System.out.println(msg + "의 syncBlockMethod1 실행중" + LocalDateTime.now());
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("methodA의 syncBlockMethod1 종료" + LocalDateTime.now());
            }
        }
    }

    public synchronized void methodB(String msg) {
        synchronized(lockB) {
            // do something
            System.out.println("methodB의 syncBlockMethod2 시작" + LocalDateTime.now());
            try {
                System.out.println(msg + "의 syncBlockMethod2 실행중" + LocalDateTime.now());
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("methodB의 syncBlockMethod2 종료" + LocalDateTime.now());
            }
        }
    }
}
