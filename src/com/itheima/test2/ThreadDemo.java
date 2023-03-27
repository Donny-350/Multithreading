package com.itheima.test2;

public class ThreadDemo {
    public static void main(String[] args) {
        Gift g1 = new Gift();
        Gift g2 = new Gift();
        g1.setName("同学1");
        g2.setName("同学2");

        g1.start();
        g2.start();
    }
}
