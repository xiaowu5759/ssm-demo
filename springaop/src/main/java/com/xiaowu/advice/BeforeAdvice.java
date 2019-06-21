package com.xiaowu.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * 写一个方法前置通知
 * before advice
 */
public class BeforeAdvice {

    public void methodBefore(){
        System.out.println("我在方法之前执行。。。");
    }

    // joinpoint 能够得到切入方法所有的参数
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("method:"+ name);
    }
}
