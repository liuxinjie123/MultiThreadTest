package com.dream.test.second;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String username) {
        System.out.println(" threadName=" + Thread.currentThread().getName() + " 执行了add方法。");
        list.add(username);
        System.out.println(" threadName=" + Thread.currentThread().getName() + " 退出了add方法。");
    }
    synchronized public int getSize() {
        System.out.println(" threadName=" + Thread.currentThread().getName() + " 执行了 getSize 方法！");
        int sizeValue = list.size();
        System.out.println(" threadName=" + Thread.currentThread().getName() + " 退出了 getSize 方法！");
        return sizeValue;
    }
}
