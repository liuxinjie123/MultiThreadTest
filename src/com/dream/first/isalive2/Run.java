package com.dream.first.isalive2;

public class Run {
    public static void main(String[] args) {
        CountOperate operate = new CountOperate();
        Thread thread = new Thread(operate);
        System.out.println("main begin thread isAlive()=" + thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAvlie()=" + thread.isAlive());
    }
}
