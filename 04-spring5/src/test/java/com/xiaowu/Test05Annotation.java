package com.xiaowu;

import com.xiaowu.pojo.Pig;
import com.xiaowu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05Annotation {

    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        UserService userService = ctx.getBean("userService", UserService.class);
        userService.eat();
    }
}
