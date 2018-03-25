package com.dream.test.first;

public class CountOperate02Run {
    public static void main(String[] args) {
        CountOperate02 c = new CountOperate02();
        Thread t1 = new Thread(c);
        System.out.println(" main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println(" main end t1 isAlive=" + t1.isAlive());
    }
}
