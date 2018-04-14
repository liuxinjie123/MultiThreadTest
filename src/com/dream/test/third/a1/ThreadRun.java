package com.dream.test.third.a1;

public class ThreadRun {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        P p1 = new P(stack);
        C c1 = new C(stack);
        ThreadP threadP1 = new ThreadP(p1);
        ThreadC threadC1 = new ThreadC(c1);
        threadP1.start();
        threadC1.start();
    }
}
