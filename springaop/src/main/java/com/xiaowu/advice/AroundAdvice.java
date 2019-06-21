package com.xiaowu.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {

    // 这是一种返回 返回值
    public Object around(ProceedingJoinPoint pjp) {
//        try {
//            System.out.println("环绕地球");
//            Object proceed = pjp.proceed();
//
//            return proceed;
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//            return null;
//        }
        System.out.println("环绕地球");
        return "nihao";

    }
}
