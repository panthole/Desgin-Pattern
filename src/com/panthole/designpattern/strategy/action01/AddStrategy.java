package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class AddStrategy implements IStrategy<String> {
    @Override
    public String operate(String i, String j) {
        String total = i + j;
        System.out.println(total);
        return total;
    }
}
