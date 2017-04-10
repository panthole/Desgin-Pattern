package com.panthole.designpattern.strategy.action01;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class ConcatStrategy implements IStrategy<String>  {
    @Override
    public String operate(String i, String j) {
        return i.concat(j);
    }
}
