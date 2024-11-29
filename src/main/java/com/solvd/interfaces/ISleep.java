package com.solvd.interfaces;

public interface ISleep {

    int SLEEP_DURATION=8;

    default void sleep(){
        System.out.println("Animal is sleeping");
    };

    void sleepDuration();
}
