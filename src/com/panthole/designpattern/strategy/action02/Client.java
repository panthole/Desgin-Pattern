package com.panthole.designpattern.strategy.action02;

import java.util.Calendar;

/**
 * 策略枚举
 * Created by panlingyue on 2017/4/10.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(StrategyEnum.ADD.exec(2,3));
        System.out.println(StrategyEnum.SUB.exec(2,3));
    }
}
