package com.xiaowu;

import com.xiaowu.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestIOC {

    @Test
    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans4.xml");
        People people = ctx.getBean("people", People.class);

//        System.out.println(Arrays.toString(people.getFriends()));
//        System.out.println(people.getFriends().length);
        System.out.println(people.getNums());
        System.out.println(people.getCats().toString());
        System.out.println(people.getPigs().toString());
        System.out.println(people.getUserMap().toString());

    }
}
