package com.dream.test.first;

import java.util.Arrays;

public class MyThread06Run {
    public static void main(String[] args) {
        MyThread06 thread06 = new MyThread06();
        Thread a = new Thread(thread06, "A");
        Thread b = new Thread(thread06, "B");
        Thread c = new Thread(thread06, "C");
        Thread d = new Thread(thread06, "D");
        Thread e = new Thread(thread06, "E");
        Thread f = new Thread(thread06, "F");
        Thread g = new Thread(thread06, "G");
        Thread h = new Thread(thread06, "H");
        Thread i = new Thread(thread06, "I");
        Thread j = new Thread(thread06, "J");
        Thread k = new Thread(thread06, "K");
        Thread l = new Thread(thread06, "L");
//        Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l).parallelStream().forEach(o -> o.start());
        Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l).stream().forEach(o -> o.start());
    }
}
