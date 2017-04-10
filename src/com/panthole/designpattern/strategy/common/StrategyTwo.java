package com.panthole.designpattern.strategy.common;

/**
 * 具体策略类
 * concrete strategy class
 * Created by panlingyue on 2017/4/10.
 */
public class StrategyTwo implements IStrategy {
    @Override
    public void operateAlgorithm() {
        System.out.println("exexute strategy two");
    }
}
