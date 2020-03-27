package com.xiaowu.pojo;

public class AliPay implements Pay {

    @Override
    public void pay() {
        System.out.println("阿里支付----");
    }
}
