package com.xiaowu.pojo;

public class Girl {

    private String name;

    private Integer age;

    private Dog dog;

    public Girl() {
        System.out.println("我来了呀");
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public  void clearDress(){
        System.out.println("我要卸妆了");
    }

    public void dress(){
        System.out.println("我先画个妆");
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
