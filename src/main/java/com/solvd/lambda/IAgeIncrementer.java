package com.solvd.lambda;

@FunctionalInterface
public interface IAgeIncrementer<T> {
    void addAge(T t1);
}
