package com.solvd.lambda;

@FunctionalInterface
public interface ICompare<T> {
    int compare(T t1, T t2);
}
