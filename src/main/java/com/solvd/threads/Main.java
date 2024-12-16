package com.solvd.threads;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Thread class
        Thread myThread = new MyThread();
        myThread.start();

        //Runnable interface
        Thread myThread2 = new Thread(new ThreadRunnable());
        myThread2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }

        Thread myThread3 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        });

        myThread3.start();

        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.execute(myThread);
        Future<Integer> a= executorService.submit(new ThreadFuture());
        System.out.println(a.get());


    }
}
