package com.xiaowu.service;

public class HelloService {

    public String msg(){
        System.out.println("我是msg");
        return "王祖贤";
    }

    public void exe(){
        System.out.println("执行exe");

        // 抛出异常,手动异常
        throw new RuntimeException("我故意的");
    }
}
