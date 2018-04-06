package com.dream.test.second;

public class MyThread4Run {
    public static void main(String[] args) {
        Task2 task = new Task2();
        MyThread3 thread3 = new MyThread3(task);
        thread3.start();
        MyThread4 thread4 = new MyThread4(task);
        thread4.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println(" 耗时=" + ((endTime - beginTime)/1000));
    }
}
