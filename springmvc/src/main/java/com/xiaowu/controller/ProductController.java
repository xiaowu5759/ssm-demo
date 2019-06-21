package com.xiaowu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/add/{id}/{name}/{price}")
    public String addProduct(@PathVariable Integer id, @PathVariable String name
    ,@PathVariable Double price){

        System.out.println(id+name+price);
        return "forward";

    }
}
