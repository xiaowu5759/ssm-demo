package com.xiaowu.advice;

import javax.xml.transform.Source;

public class AfterReturnAdvice {

    public void afterReturn(String returning){
        System.out.println("轻轻地离开");
        System.out.println("返回值："+returning);
    }

}
