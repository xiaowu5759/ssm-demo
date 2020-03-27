package com.xiaowu5759.pojo;

public class UserWithDetial extends User {

    private UserDetial userDetial;

    public UserDetial getUserDetial() {
        return userDetial;
    }

    public void setUserDetial(UserDetial userDetial) {
        this.userDetial = userDetial;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + getuId() +
                ", phone=" + getPhone() +
                ", passward=" + getPassward() +
                ", createDate=" + getCreateDate() +
                ", statue=" + getStatue() +
                '}' + "UserWithDetial{" +
                "userDetial=" + userDetial +
                '}';
    }
}
