package com.dream.test.third.a2;

public class ThreadRun {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        P p = new P(stack);
        C c1 = new C(stack);
        C c2 = new C(stack);
        C c3 = new C(stack);
        C c4 = new C(stack);
        C c5 = new C(stack);
        ThreadP threadP = new ThreadP(p);
        threadP.start();
        ThreadC threadC1 = new ThreadC(c1);
        ThreadC threadC2 = new ThreadC(c2);
        ThreadC threadC3 = new ThreadC(c3);
        ThreadC threadC4 = new ThreadC(c4);
        ThreadC threadC5 = new ThreadC(c5);
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();
    }
}
