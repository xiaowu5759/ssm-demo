package com.xiaowu.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
// 标记当前这个类为spring的组件
// 相当于在xml中注册一个bean
@Component
// 标记它为一个切面
@Aspect
public class ZBeforeAdvice {

    // 很神奇 是按照名字决定顺序的

//    @Order(10)  //貌似无用

    // 将其分成两个类
//    @Before("execution(* com..*.*(..))" )
//    public void before2(){
//        System.out.println("在此之前之前。。。");
//    }


//    @Order(1)
    // * com..*.*.*(..) 这个切不到com下面的类
    // * com..*.*(..) 这样能com及其所有的子包
    @Before("execution(* com..*.*(..))" )
    public void before3(){
        System.out.println("在此之前。。。");
    }


}
