package com.xiaowu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZAroundAdvice {

    @Around("execution(* com..*.*(..))")
    // 这也是对异常响应
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("我是环绕");
        Object proceed = pjp.proceed();
        return proceed;

    }
}
