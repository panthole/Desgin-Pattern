package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class Client {
    static OperateStrategy operateStrategy;

    public static void main(String[] args) {

        //通用策略模式
        String[] strings = {"Design Pattern", " Strategy"};
        operateStrategy=new OperateStrategy(strings,new AddStrategy());
        operateStrategy.Operate();

        //策略类匿名类声明
        OperateStrategyEx operateStrategyEx=new OperateStrategyEx(strings, (s1, s2) -> {
            System.out.println(s1+s2);
        });
        operateStrategyEx.Operate();
    }
}
