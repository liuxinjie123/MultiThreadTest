package com.dream.test.second;

public class MyThread10 extends Thread {
    private MyOneList list;
    public MyThread10(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyOneListService service = new MyOneListService();
        service.addServiceMethod(list, "B");
    }
}
