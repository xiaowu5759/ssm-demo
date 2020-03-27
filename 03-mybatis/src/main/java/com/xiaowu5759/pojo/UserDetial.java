package com.xiaowu5759.pojo;

public class UserDetial {
    private Long udId;

    // oop的写法 表示一种关系
    // 面向对象设计
    private User user;

    private String address;
    private String cId;

    public Long getUdId() {
        return udId;
    }

    public void setUdId(Long udId) {
        this.udId = udId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "UserDetial{" +
                "udId=" + udId +
                ", user=" + user +
                ", address='" + address + '\'' +
                ", cId='" + cId + '\'' +
                '}';
    }
}
