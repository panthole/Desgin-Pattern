package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public interface IStrategy<T> {
    public T operate(T t1, T t2);
}
