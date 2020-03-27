package com.xiaowu;

import com.xiaowu.pojo.People;
import com.xiaowu.pojo.User;
import com.xiaowu.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowired.xml");
        User user = ctx.getBean("user", User.class);

        System.out.println(user.getPig().getName());

    }

    @Test
    public void m2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowired.xml");
        ProviderService providerService = ctx.getBean("providerService", ProviderService.class);

        // 能够自动注入 推荐

        // 方便执行，只需要在spring的容器中，注册我们的bean就可以了

        providerService.update();

    }
}
