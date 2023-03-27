package com.itheima.a02threadcase2;

public class ThreadDemo {

    public static void main(String[] args) {
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setName("1");
        t2.setName("2");
        t1.start();
        t2.start();
    }

}
