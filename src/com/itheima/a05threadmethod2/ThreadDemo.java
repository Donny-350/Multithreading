package com.itheima.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
