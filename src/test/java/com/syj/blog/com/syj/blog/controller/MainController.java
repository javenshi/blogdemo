package com.syj.blog.com.syj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"","/"})
    public String main(){
System.out.print("11");
        return "index.html";
    }
}
