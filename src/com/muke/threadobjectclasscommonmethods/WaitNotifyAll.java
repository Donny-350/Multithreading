package com.muke.threadobjectclasscommonmethods;

public class WaitNotifyAll implements Runnable {

    private static final Object resourceA = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new WaitNotifyAll();
        Thread threadA = new Thread(r);
        Thread threadB = new Thread(r);
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    resourceA.notifyAll();
                    System.out.println("ThreadC notified.");
                }
            }
        });
        threadA.start();
        threadB.start();
        Thread.sleep(200);
        threadC.start();
    }

    @Override
    public void run() {
        synchronized (resourceA) {
            System.out.println(Thread.currentThread().getName() + "got resourceA lock.");
            try {
                System.out.println(Thread.currentThread().getName() + "wait to start.");
                resourceA.wait();
                System.out.println(Thread.currentThread().getName() + "s waiting to end.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
