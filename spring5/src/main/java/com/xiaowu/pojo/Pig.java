package com.xiaowu.pojo;

public class Pig {

    private String name;

    private Integer sleep;

    private String kw;  //口味

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", sleep=" + sleep +
                ", kw='" + kw + '\'' +
                '}';
    }
}
