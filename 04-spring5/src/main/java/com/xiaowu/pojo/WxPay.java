package com.xiaowu.pojo;

public class WxPay implements Pay{

    @Override
    public void pay() {
        System.out.println("微信支付----");
    }
}
