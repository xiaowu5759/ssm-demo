package com.xiaowu.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// 标记它为一个组件 注解需要激活
//@Component("userService")  // 添加名字
//@Component
//@Service
@Repository
public class UserService {

    public void eat(){
        System.out.println("吃了一斤西瓜");
    }
}
