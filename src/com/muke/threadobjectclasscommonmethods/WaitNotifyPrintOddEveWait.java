package com.muke.threadobjectclasscommonmethods;

/**
 * 两个线程交替打印0～100的奇偶数，用wait和notify
 */
public class WaitNotifyPrintOddEveWait {

    private static int count;
    private static final Object lock = new Object();

    // 1. 拿到锁，我们就打印
    // 2. 打印完，唤醒其他线程，自己就休眠
    static class TurningRunner implements Runnable {

        @Override
        public void run() {
            while (count <= 100) {
                synchronized (lock) {
                    //拿到锁就打印
                    System.out.println(Thread.currentThread().getName()+ ":" + count++);
                    lock.notify();
                    if(count <= 100) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        TurningRunner turningRunner = new TurningRunner();
        Thread threadEven = new Thread(turningRunner, "偶数");
        Thread threadOdd = new Thread(turningRunner, "奇数");
        threadEven.start();
        threadOdd.start();
    }
}
