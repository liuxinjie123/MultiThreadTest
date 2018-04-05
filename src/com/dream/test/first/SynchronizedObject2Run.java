package com.dream.test.first;

public class SynchronizedObject2Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject2 object = new SynchronizedObject2();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println(" thread2 启动了， 但进不了printString方法！ 只打印一个begin。");
                    System.out.println(" 因为printString()方法被a线程锁定并且永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
