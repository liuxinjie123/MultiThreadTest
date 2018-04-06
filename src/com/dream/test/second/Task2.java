package com.dream.test.second;

public class Task2 {
    private String getData1;
    private String getData2;
    public void doLongTimeTask() {
        try {
            System.out.println(" begin task ");
            Thread.sleep(1000);
            String privateGetData1 = "长时间处理任务后，从后台返回的值 1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后，从后台返回的值 2 threadName=" + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
            }
            System.out.println(" getData1=" + getData1);
            System.out.println(" getData2=" + getData2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
