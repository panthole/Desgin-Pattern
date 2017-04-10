package com.panthole.designpattern.strategy.action03;

import java.io.Serializable;

/**
 * Created by panlingyue on 2017/4/10.
 */
public class Host {
    private static class StrLenCmp implements Comparator<String>, Serializable{

        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR= new StrLenCmp();
}
