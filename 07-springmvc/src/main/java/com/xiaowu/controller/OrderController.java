package com.xiaowu.controller;

import com.xiaowu.pojo.Orders;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Component
@RequestMapping("/orders")
public class OrderController {

    @RequestMapping("/addOrders")
    // 返回类型为String，String就是逻辑的视图名称
    public String addOrders(Model model){
        List<Orders> list = new ArrayList<>();

        Orders orders = new Orders();
        orders.setId("1");
        orders.setName("洗面奶");
        orders.setTotal(333.3);

        Orders orders2 = new Orders();
        orders2.setId("2");
        orders2.setName("电脑");
        orders2.setTotal(33333.3);

        list.add(orders);
        list.add(orders2);

        model.addAttribute("orders",list);

        // 不在需要
        // setViewName() return modelAndView;
        return "orders";
    }

}
