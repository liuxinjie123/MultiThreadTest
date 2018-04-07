package com.dream.test.second;

public class MyOneListService {
    public MyOneList addServiceMethod(MyOneList list, String data) {
        System.out.println(" threadName=" + Thread.currentThread().getName() + " enter ");
        try {
            synchronized (list) {
                System.out.println("list.getSize=" + list.getSize());
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" threadName=" + Thread.currentThread().getName() + " leave.");
        return list;
    }
}
