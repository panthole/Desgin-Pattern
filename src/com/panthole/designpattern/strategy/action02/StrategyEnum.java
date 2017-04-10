package com.panthole.designpattern.strategy.action02;

/**
 * Created by panlingyue on 2017/4/10.
 */
public enum StrategyEnum {

    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String symbol;

    StrategyEnum(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    public abstract int exec(int a, int b);
}
