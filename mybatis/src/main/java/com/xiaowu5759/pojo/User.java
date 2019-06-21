package com.xiaowu5759.pojo;

import java.util.Date;

public class User {
    private Long uId;
    private String phone;
    private String passward;
    private Date createDate;
    private Integer statue;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", phone='" + phone + '\'' +
                ", passward='" + passward + '\'' +
                ", createDate=" + createDate +
                ", statue=" + statue +
                '}';
    }
}
