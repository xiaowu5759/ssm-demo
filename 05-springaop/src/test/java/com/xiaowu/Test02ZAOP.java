package com.xiaowu;

import com.HelloBaby;
import com.xiaowu.service.HelloServiceBaby;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02ZAOP {

    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");

        HelloBaby helloBaby = ctx.getBean("helloBaby", HelloBaby.class);
        HelloCoolBaby helloCoolBaby = ctx.getBean("helloCoolBaby", HelloCoolBaby.class);
        HelloServiceBaby helloServiceBaby = ctx.getBean(HelloServiceBaby.class);

        helloServiceBaby.show("小花");
//        helloCoolBaby.show();
//
//        helloBaby.show();
    }

    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");
        HelloServiceBaby helloServiceBaby = ctx.getBean(HelloServiceBaby.class);

        helloServiceBaby.eat("小花");
    }

    @Test
    public void m3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");
        HelloServiceBaby helloServiceBaby = ctx.getBean(HelloServiceBaby.class);

        helloServiceBaby.star();
    }

    @Test
    public void m4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");
        HelloServiceBaby helloServiceBaby = ctx.getBean(HelloServiceBaby.class);

        helloServiceBaby.throwMethod();
    }

    @Test
    public void m5() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext2.xml");
        HelloServiceBaby helloServiceBaby = ctx.getBean(HelloServiceBaby.class);

        helloServiceBaby.throwMethod();
    }
}
