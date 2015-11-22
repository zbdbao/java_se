package com.meme.thread;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhangb on 18/11/2015.
 */
public class ThreadWithTerminate {
    public static void main(String[] args){
        int threadPoolSize = 5;
        ExecutorService threadPool = Executors.newFixedThreadPool(threadPoolSize);

        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(1000000);

        ExecutorService executor = new ThreadPoolExecutor(1, threadPoolSize, 0l, TimeUnit.HOURS, queue, new ThreadPoolExecutor.CallerRunsPolicy());

        for(int i=0; i<10; i++){
//            threadPool.execute(new LocalThread(String.valueOf(i)));
            executor.execute(new LocalThread(String.valueOf(i)));

            System.out.println("Queue size:"+queue.size());
        }


    }
}

class LocalThread extends Thread{

    private String name;

    public LocalThread(String name){
        this.name = name;
    }

    @Override
    public void run() {

        for (int i=0; i<5; i++){
            System.out.println(name+"--In run:"+Thread.currentThread().getName());
            try {
//                Thread.sleep(1000);
                SingletonClass.getInstance().test(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class SingletonClass{

    private static SingletonClass INSTANCE = null;
    private static Lock lock = new ReentrantLock();
    private SingletonClass(){

    }

    public synchronized static SingletonClass getInstance(){
        if(INSTANCE == null){
            lock.lock();
            if(INSTANCE == null){
                INSTANCE = new SingletonClass();
            }
            lock.unlock();
        }

        return INSTANCE;
    }

    public void test(int seq) throws InterruptedException {
        System.out.println("Start time:"+seq);

        Thread.sleep(10000);

        System.out.println("End time:"+seq);
    }
}