package com.dream.test.third.a3;

public class ThreadRun {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        P p1 = new P(stack);
        P p2 = new P(stack);
        P p3 = new P(stack);
        P p4 = new P(stack);
        P p5 = new P(stack);
        ThreadP threadP1 = new ThreadP(p1);
        ThreadP threadP2 = new ThreadP(p2);
        ThreadP threadP3 = new ThreadP(p3);
        ThreadP threadP4 = new ThreadP(p4);
        ThreadP threadP5 = new ThreadP(p5);
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();
        C c1 = new C(stack);
        ThreadC threadC = new ThreadC(c1);
        threadC.start();
    }
}
