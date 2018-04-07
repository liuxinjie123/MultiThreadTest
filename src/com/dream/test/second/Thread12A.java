package com.dream.test.second;

public class Thread12A extends Thread {
    private MyList list;
    public Thread12A(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("threadA" + (i+1));
        }
    }
}
