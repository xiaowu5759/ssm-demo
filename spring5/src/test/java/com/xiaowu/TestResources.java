package com.xiaowu;

import com.xiaowu.dao.ProviderDao;
import com.xiaowu.pojo.Pig;
import com.xiaowu.pojo.User;
import com.xiaowu.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResources {

    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resources.xml");
        ProviderDao providerDao = ctx.getBean("providerDao", ProviderDao.class);

        System.out.println(providerDao.getDriver());

    }

    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        Pig pig = ctx.getBean("pig", Pig.class);
        Pig pig2 = ctx.getBean("pig2", Pig.class);

        System.out.println(pig);
        System.out.println(pig2);

    }

}
