package com.dream.first.run;

import com.dream.first.service.MyThread6;

public class RunMyThread6 {
    public static void main(String[] args) {
        MyThread6 thread6 = new MyThread6();
        Thread a = new Thread(thread6, "A");
        Thread b = new Thread(thread6, "B");
        Thread c = new Thread(thread6, "C");
        Thread d = new Thread(thread6, "D");
        Thread e = new Thread(thread6, "E");
        Thread f = new Thread(thread6, "F");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
    }
}
