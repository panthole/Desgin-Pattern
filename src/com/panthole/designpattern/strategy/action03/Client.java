package com.panthole.designpattern.strategy.action03;

/**
 * 静态成员类实现策略类
 * Created by panlingyue on 2017/4/10.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Host.STRING_LENGTH_COMPARATOR.compare("pan","lingyue"));
    }
}
