package com.dream.test.second;

public class Father1ThreadRun {
    public static void main(String[] args) {
        Father1MyThread thread = new Father1MyThread();
        thread.start();
    }
}
