package com.itheima.test2;

public class Gift extends Thread {

    static int giftNum = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Gift.class) {
                if(giftNum <= 10) {
                    break;
                }
                else{
                    try {
                        Thread.sleep(50);
                        giftNum--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ "送出一份礼物，现在还剩下" + giftNum + "件礼物");
                }
            }
        }
    }
}
