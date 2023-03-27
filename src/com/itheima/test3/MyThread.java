package com.itheima.test3;

public class MyThread extends Thread{

    static int number = 1;

    @Override
    public void run() {
        while (number <= 100){
            synchronized (MyThread.class) {
                if(number > 100) {
                    break;
                }

                if (number % 2 == 1){
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                }
                number++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
