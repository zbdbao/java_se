package com.meme.thread;

/**
 * Created by zhangb on 18/11/2015.
 */
public class ThreadWaitTest {

    public static void main(String[] args){

        new TheadLocal().test();
    }
}

class TheadLocal extends Thread {

    @Override
    public void run() {
        System.out.println("Thread started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread end");
        this.notifyAll();

    }

    public void test(){
        this.start();
        System.out.println("Thread sent");

        try {
            this.wait(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test complete end");
    }
}