package com.panthole.designpattern.strategy.common;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        this.strategy.operateAlgorithm();
    }
}
