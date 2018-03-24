package com.dream.test.first;

/**
 * jack
 */
public class MainThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().toString());
    }
}
