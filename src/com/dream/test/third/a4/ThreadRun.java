package com.dream.test.third.a4;

import java.util.TreeMap;

public class ThreadRun {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        P p1 = new P(stack);
        P p2 = new P(stack);
        P p3 = new P(stack);
        P p4 = new P(stack);
        P p5 = new P(stack);
        P p6 = new P(stack);
        ThreadP threadP1 = new ThreadP(p1);
        ThreadP threadP2 = new ThreadP(p2);
        ThreadP threadP3 = new ThreadP(p3);
        ThreadP threadP4 = new ThreadP(p4);
        ThreadP threadP5 = new ThreadP(p5);
        ThreadP threadP6 = new ThreadP(p6);
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();
        threadP6.start();
        C c1 = new C(stack);
        C c2 = new C(stack);
        C c3 = new C(stack);
        C c4 = new C(stack);
        C c5 = new C(stack);
        C c6 = new C(stack);
        C c7 = new C(stack);
        C c8 = new C(stack);
        ThreadC threadC1 = new ThreadC(c1);
        ThreadC threadC2 = new ThreadC(c2);
        ThreadC threadC3 = new ThreadC(c3);
        ThreadC threadC4 = new ThreadC(c4);
        ThreadC threadC5 = new ThreadC(c5);
        ThreadC threadC6 = new ThreadC(c6);
        ThreadC threadC7 = new ThreadC(c7);
        ThreadC threadC8 = new ThreadC(c8);
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();
        threadC6.start();
        threadC7.start();
        threadC8.start();
    }
}
