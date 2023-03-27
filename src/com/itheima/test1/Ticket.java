package com.itheima.test1;

public class Ticket extends Thread{

    static int ticketNum = 1000;

    @Override
    public void run() {
        while (true){
            synchronized (Ticket.class) {
                if(ticketNum > 0) {
                    try {
                        Thread.sleep(3000);
                        ticketNum--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余票数为：" + ticketNum);
                } else {
                    break;
                }
            }
        }
    }
}
