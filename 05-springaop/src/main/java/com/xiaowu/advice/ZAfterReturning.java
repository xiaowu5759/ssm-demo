package com.xiaowu.advice;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ZAfterReturning {

    // 如果需要两个以上参数，需要键
    @AfterReturning(value = "execution(* com..*.*(..))", returning = "returning")
    // 需要 returning参数
    public void afterReturing(String returning){
        System.out.println("返回值之后。。。");
        System.out.println("返回值："+ returning);
    }
}
