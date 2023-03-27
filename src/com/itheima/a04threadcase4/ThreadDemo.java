package com.itheima.a04threadcase4;

public class ThreadDemo {
    public static void main(String[] args) {

        //1.创建线程的对象
//        MyThread t1 = new MyThread("飞机");
//        MyThread t2 = new MyThread("坦克");
//
//        //2.开启线程
//        t1.start();
//        t2.start();
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
    }
}
