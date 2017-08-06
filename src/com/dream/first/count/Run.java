package com.dream.first.count;

public class Run {
    public static void main(String[] args) {
        CountOperate t = new CountOperate();
        Thread thread = new Thread(t);
        thread.setName("A");
        thread.start();
    }
}
