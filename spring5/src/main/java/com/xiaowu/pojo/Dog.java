package com.xiaowu.pojo;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("好狗");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
