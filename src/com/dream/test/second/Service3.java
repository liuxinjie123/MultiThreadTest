package com.dream.test.second;

public class Service3 {
    private String usernameParam;
    private String passwordParam;
    public void setUsernameParamPassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println(" 线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入同步块！");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println(" 线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开同步块！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
