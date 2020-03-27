package com.xiaowu.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceBaby {

    public void show(String name){
        System.out.println("三级宝贝" + name);
    }
    public void eat(String eat) {
        System.out.println("吃了" + eat);
    }

    public String star(){
        System.out.println("星星");
        return "亮闪闪";
    }

    public void throwMethod() {
        System.out.println("我准备异常");
        throw new  RuntimeException("狼来了");
    }

}
