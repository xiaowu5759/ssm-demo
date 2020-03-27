package com.xiaowu.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZAfterThrowingAdvice {

    @AfterThrowing(value = "execution(* com..*.*(..))", throwing = "ex")

    // 参数类型 要选择Exception
    public void throwing(JoinPoint joinPoint,Exception ex){
        System.out.println("异常之后" + joinPoint.getSignature().getName());
        System.out.println("异常信息："+ ex);

    }
}
