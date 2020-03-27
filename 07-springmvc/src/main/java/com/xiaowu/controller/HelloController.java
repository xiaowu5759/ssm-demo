package com.xiaowu.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 实现一个controller接口的方式
public class HelloController implements Controller {

    @Override
    // 需要加入servlet依赖
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("girl", "feifei");

        mav.setViewName("girl");
        return mav;
    }
}
