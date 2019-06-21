package com.xiaowu.service;

import com.xiaowu.dao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired  //自动注入
    private BillDao billDao;

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }

    public void pay(Double money) {
        System.out.println("bill service pay");
        billDao.pay(money);
    }
}
