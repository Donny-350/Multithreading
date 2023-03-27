package com.itheima.a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        
        MyThread t = new MyThread();
        t.setName("土豆");
        t.start();

        //表示把t这个线程，插入到当前线程之前
        //t：土豆
        //当前线程；

        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
