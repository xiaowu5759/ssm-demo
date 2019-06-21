package com.xiaowu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// 在类级别 注释 1 2 3依次顺序
@Order(10)
@Component
@Aspect
public class ZBeforeAdvice2 {

    @Before("execution(* com..*.*(..))" )
    public void before(JoinPoint joinPoint){
        // 获取方法名，参数
        System.out.println("在此之前之前。。。");
        System.out.println(joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));

    }
}
