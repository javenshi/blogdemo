package com.syj.blog.controller;


import com.syj.blog.dao.BlogsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private BlogsDao blogsDao;

    @RequestMapping(value = {"","/"})
    public String main(){
        System.out.println(blogsDao);
        blogsDao.findAll();
System.out.print("111111111111");
        return "index.html";
    }
    @RequestMapping(value = "page")
    public String page(){
        System.out.print("11111112222211111");
        return "page.html";
    }

}
