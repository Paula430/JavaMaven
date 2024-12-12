package com.solvd.lambda;

@FunctionalInterface
public interface ICheck<T> {
    boolean check(T t);
}
