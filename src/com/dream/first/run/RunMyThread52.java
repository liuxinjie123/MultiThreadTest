package com.dream.first.run;

import com.dream.first.service.MyThread5;

public class RunMyThread52 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        Thread a = new Thread(myThread5, "A");
        Thread b = new Thread(myThread5, "B");
        Thread c = new Thread(myThread5, "C");
        Thread d = new Thread(myThread5, "D");
        Thread e = new Thread(myThread5, "E");
        Thread f = new Thread(myThread5, "F");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
    }
}
