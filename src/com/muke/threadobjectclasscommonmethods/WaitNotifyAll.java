package com.muke.threadobjectclasscommonmethods;

public class WaitNotifyAll implements Runnable {

    private static final Object resourceA = new Object();

    @Override
    public void run() {
        synchronized (resourceA) {
            System.out.println(Thread.currentThread().getName() + "got resourceA lock.");
            try {
                System.out.println(Thread.currentThread().getName() + "wait to start.");
                resourceA.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
