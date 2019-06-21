package com.xiaowu.controller;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/yes")
public class YesController {

    @RequestMapping("/forward")
    // 进行转发
    public String forward(Model model){
        // springmvc model 默认上在请求域当中存储值
        model.addAttribute("skill","睡觉");
        System.out.println("111");
        return "forward";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model){

        // 由于model是请求级别的，如果重定向
        // model存的东西取不出来，证明是重定向，不会转发
        model.addAttribute("skill","煮饭");
        System.out.println("222");
        // 不带斜杠的写法上一个相对路径，根据当前上下文决定的
        // 如果是重定向，就跟视图解析器就没有关系了
        return "redirect:/jsp/redirect.jsp";
    }

    @RequestMapping("/forward2")
    public String forwardAnotherController(){

        return "forward:/baby/greet";
    }
}
