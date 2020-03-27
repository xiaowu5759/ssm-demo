package com.xiaowu.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/baby")
public class BabyController {

    @RequestMapping("/greet")
    public String greeting(){
        System.out.println("baby hello");
        return "forward";
    }
}
