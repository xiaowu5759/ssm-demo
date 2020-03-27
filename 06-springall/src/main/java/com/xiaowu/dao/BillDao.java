package com.xiaowu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BillDao {
    public void pay(Double money) {

        System.out.println("bill dao ..");
        System.out.println("pay:" + money);

    }
}
