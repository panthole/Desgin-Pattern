package com.panthole.designpattern.strategy.common;

/**
 * 策略模式通用
 * Created by panlingyue on 2017/4/10.
 */
public class Client{
    public static void main(String[] args) {
        Context context = new Context(new StrategyOne());
        context.operate();
    }
}
