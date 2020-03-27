package com.xiaowu;

import com.xiaowu.advice.AfterReturnAdvice;
import com.xiaowu.service.HelloService;
import com.xiaowu.service.ProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test01AOP {

    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        // 如果不是spring容器所管理的bean，那么织入行为是无法生效的
//        让代码生效，这种行为叫做织入
//        ProviderService providerService = new ProviderService();
        ProviderService providerService = ctx.getBean("providerService", ProviderService.class);

//        providerService.add();
        providerService.add("你好");
    }

    @Test
    public void m2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");


        ProviderService providerService = ctx.getBean("providerService", ProviderService.class);

//        providerService.add();
        providerService.add("头皮屑");
    }

    @Test
    public void m3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        HelloService helloService = ctx.getBean("helloService", HelloService.class);

        helloService.msg();


    }

    @Test
    public void m4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        HelloService helloService = ctx.getBean("helloService", HelloService.class);

        helloService.exe();


    }

    @Test
    public void m5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        HelloService helloService = ctx.getBean("helloService", HelloService.class);

        helloService.msg();


    }

}
