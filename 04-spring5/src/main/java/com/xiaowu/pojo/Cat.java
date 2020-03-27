package com.xiaowu.pojo;

public class Cat {
    private String skin;

    private Integer leg;

    public String getSkin() {

        return skin;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "skin='" + skin + '\'' +
                ", leg=" + leg +
                '}';
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Integer getLeg() {
        return leg;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }
}
