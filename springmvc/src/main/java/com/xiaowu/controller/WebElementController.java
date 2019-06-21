package com.xiaowu.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
@RequestMapping("/web")
public class WebElementController {

    // 模拟请求
    @RequestMapping("/request")

    // 接口和Servlet几乎一样  但是是不同的
    public String request(WebRequest request){
        System.out.println(request.getParameter("girl"));
        return "forward";
    }

    // HttpServletRequest和ServletRequest
    // 更多是对于http协议的
    @RequestMapping("/request2")
    public String request2(HttpServletRequest request){
        System.out.println(request.getParameter("boy"));
        return "forward";
    }


    // 获取session
    @RequestMapping("/request3")
    public String request2(HttpSession session){
        session.setAttribute("g","神庙逃亡");
        session.getServletContext().setAttribute("context","我最帅");
        return "redirect:/jsp/redirect.jsp";
    }

    // 请求映射的路径path可以写多个值
//    @RequestMapping(value = {"m1","m2"})
//    总共八种method参数 http请求 有八种方式
//    GET,
//    HEAD,
//    POST,
//    PUT,
//    PATCH,
//    DELETE,
//    OPTIONS,
//    TRACE;

    // 如果没有限定，啥请求都可以
    @RequestMapping(path = {"m1","m2"}, method = RequestMethod.GET)
    public String m1(){
        System.out.println("m1...");
        return "forward";
    }

    // 路径有重名，这就要考spring的默认机制了
    // params描述了，我需要两个参数，一个是girl，一个是boy
    @RequestMapping(path = {"m2"}, params = {"girl == wangfei","boy !== guandong"})
    public String m2(){
        System.out.println("m1...");
        return "forward";
    }

//    @RequestMapping(path = {"m3?"})
//    @RequestMapping(path = {"m3*"})
    @RequestMapping(path = {"m3**"})

    public String m3(){
        System.out.println("m3...");
        return "forward";
    }


    // 测试删除请求
    @DeleteMapping(path = {"/m4"})
    public String m4(){
        System.out.println("m4...");
        return "forward";
    }


}
