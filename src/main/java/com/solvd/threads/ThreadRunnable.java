package com.solvd.threads;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
