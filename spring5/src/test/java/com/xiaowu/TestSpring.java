package com.xiaowu;

import com.xiaowu.pojo.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class TestSpring {

    @Test
    public void m1() {

         //1. 获取上下文对象，spring里面声明对象都需要上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.  通过这个对象获取我们的girl
        Girl g = (Girl)ctx.getBean("girl");
        System.out.println(g);
//        ((PrettyGirl)g).show();  //向下强转
    }

    @Test
    public void m2() {

         //1. 获取上下文对象，spring里面声明对象都需要上下文对象获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.  通过这个对象获取
        // 只需要修改配置文件
        // 如果不需要的细节，都屏蔽掉，更加安全

        // 应用程序中 需要 就是一个依赖
        Pay pay = (Pay) ctx.getBean("pay");
        pay.pay();

    }

    @Test
    public void m3() {
        //1 读取多个spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"beans1.xml","beans2.xml"});

        // 下面的方式由于指定了class 不需要强转
        Girl myG = ctx.getBean("myGirl", Girl.class);
//        Girl youG = ctx.getBean("yourGirl", Girl.class);
        Girl girl = ctx.getBean("hisGirl", Girl.class);

//        System.out.println(myG.getName());
        System.out.println(girl);
//        ((ClassPathXmlApplicationContext)ctx).close();

    }

    @Test
    public void m4() {
        //1 读取多个spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");

        //尝试获取的时候  这些是通过id或者别名来获取的
        Girl girl = ctx.getBean("girl", Girl.class);

    }

    @Test
    public void m5() {
        //1 读取多个spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");

        // 直接通过类 类型来获取
        // 当spring上下文配置文件中，有两个相同类的bean就不可以
        Dog bean = ctx.getBean(Dog.class);
        Girl girl = ctx.getBean(Girl.class);
        System.out.println(girl.getDog().getName());

    }

    @Test
    public void m6() {
        //1 读取多个spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");

        // 直接通过类 类型来获取
        Dog dog2 = ctx.getBean("dog2",Dog.class);
        System.out.println(dog2.getName());

    }

    @Test
    public void m7() {
        //1 读取多个spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");

        // 直接通过类 类型来获取
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);

    }

}

