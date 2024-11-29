package com.solvd.interfaces;

public interface IRun {
    void runningSpeed();

    default void run(){
        System.out.println("Animal is running");
    }
}
