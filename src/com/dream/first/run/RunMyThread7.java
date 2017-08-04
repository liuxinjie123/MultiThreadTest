package com.dream.first.run;

import com.dream.first.service.MyThread7;

public class RunMyThread7 {
    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        Thread a = new Thread(myThread7, "A");
        Thread b = new Thread(myThread7, "B");
        Thread c = new Thread(myThread7, "C");
        Thread d = new Thread(myThread7, "D");
        Thread e = new Thread(myThread7, "E");
        Thread f = new Thread(myThread7, "F");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
    }
}
