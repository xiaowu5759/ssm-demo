package com.xiaowu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// 不需要集成任何类，不需要实现任何接口，没有强迫我
@Controller
// 一般形式 都是controller的前缀
@RequestMapping("/bye")
public class ByeController {

    // ModelAndView
    @RequestMapping("/bye")
    public String bye(Model model){
        model.addAttribute("model","再见");
        //这里return就是 我们的viewName
        return "bye";
    }



}
