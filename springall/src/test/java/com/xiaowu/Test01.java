package com.xiaowu;

import com.xiaowu.config.SpringConfig;
import com.xiaowu.dao.BillDao;
import com.xiaowu.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {


    @Test
    public void m1(){
        // 如何获取上下文对象
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Girl girl = ctx.getBean("girl", Girl.class);

        System.out.println(girl.getName());

    }

    @Test
    public void m2(){
        // 如何获取上下文对象
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BillService billService = ctx.getBean("billService", BillService.class);

        // 在只有一个类的时候 不需要名字id也是可以的
        BillDao billDao = ctx.getBean(BillDao.class);

        billService.setBillDao(billDao);
        billService.pay(2333.3);
    }

    @Test
    public void m3(){
        // 如何获取上下文对象
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BillService billService = ctx.getBean("billService", BillService.class);

        billService.pay(22.2);
    }
}
