package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class OperateStrategyEx {
    private String[] strings;
    private final IStrategyEx strategy;

    public OperateStrategyEx(String[] strings, IStrategyEx strategy){
        this.strings = strings;
        this.strategy = strategy;
    }

    public void Operate(){
        strategy.operate(strings[0],strings[1]);
    }
}
