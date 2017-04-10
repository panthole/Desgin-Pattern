package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class OperateStrategy {
    private String[] strings;
    private final IStrategy strategy;

    public OperateStrategy(String[] strings,IStrategy strategy){
        this.strings = strings;
        this.strategy = strategy;
    }

    public void Operate(){
        strategy.operate(strings[0],strings[1]);
    }
}
