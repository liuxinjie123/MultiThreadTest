package com.dream.test.first;

public class MyObject extends Thread {
    private String username = "1";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println(" stop thread a ");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void  printUserPassword() {
        System.out.println(username + " - " + password);
    }
}
