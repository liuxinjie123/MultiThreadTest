package com.dream.first.id;

public class IdTest {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " --- " + runThread.getId());
    }
}
