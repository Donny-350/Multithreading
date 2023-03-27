package com.itheima.a01threadcase1;

public class MyThread extends Thread{
    /**
     * 多线程的第一种启动方式：
     * 1. 自己定义一个
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(getName() + "Hello World");
        }
    }
}
