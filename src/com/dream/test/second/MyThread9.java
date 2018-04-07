package com.dream.test.second;

public class MyThread9 extends Thread {
    private MyOneList list;
    public MyThread9(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyOneListService service = new MyOneListService();
        service.addServiceMethod(list, "A");
    }
}
