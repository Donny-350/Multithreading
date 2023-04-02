package com.muke.jmm;

import java.util.concurrent.CountDownLatch;

/**
 * 演示重排序的现象
 */
public class OutOfOrderExecution {

    private volatile static int x = 0, y = 0;
    private volatile static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1);

        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    latch.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a = 1;
                x = b;
            }
        });

        Thread two = new Thread(new Runnable() {
            @Override
            public void run() {
                b = 1;
                y = a;
            }
        });

        two.start();
        one.start();

        latch.countDown();

        one.join();
        two.join();

        System.out.println("x = " + x + ", y = " + y);
    }
}
