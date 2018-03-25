package com.dream.test.first;

public class CountOperate01Run {
    public static void main(String[] args) {
        CountOperate01 c = new CountOperate01();
        Thread thread = new Thread(c);
        thread.setName("A");
        thread.start();
    }
}
