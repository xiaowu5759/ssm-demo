package com.xiaowu.advice;

// spring只能在运行时织入
// 如果你要做的功能不是特别强，spring就足够了，aop编程

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// After的先后和before的先后 正好相反的 先 3 2 1 依次
@Aspect
@Component
public class ZAfterAdvice {
    @After("execution(* com.xiaowu.service.HelloServiceBaby.eat(java.lang.String))")
    public void after() {
        System.out.println("在此之后");

    }

}
