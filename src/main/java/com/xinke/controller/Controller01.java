package com.xinke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Controller01 {
    @RequestMapping("/show")
    public String show(){
        System.out.println("调用了Controller01 的show方法~！");
        System.out.println("新添加了点东西");
        return "success";
    }
}
