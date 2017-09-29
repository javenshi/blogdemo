package com.syj.blog.com.syj.blog.controller;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class MainController {
    @RequestMapping(value = {"","/"})
    public String main(){
System.out.print("111111111111");
        return "index.html";
    }
    @RequestMapping(value = "page")
    public String page(){
        System.out.print("11111112222211111");
        return "page.html";
    }
    @RequestMapping(value="uploadImag", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadImag(@RequestParam MultipartFile file, HttpServletRequest request){
        System.out.println("do upload the imag!");
        System.out.println(file);
        String path = request.getSession().getServletContext().getRealPath("WEB-INF/upload");
        System.out.println(path);
        String oldName = file.getOriginalFilename();
        System.out.println("oldName is :" + oldName);
        String newName = "";
        System.out.println("newName is :" + newName);
        newName = newName + oldName.substring(oldName.lastIndexOf("."));
        JSONObject object = new JSONObject();
        try{
            file.transferTo(new File(path, newName));
        }catch(Exception e){
            e.printStackTrace();
        }
        //ImageData data = new ImageData();
       // data.setSrc("upload/" + newName);
        object.put("code", 0);
     //   object.put("data", data);
        object.put("src", "upload/" + newName);
        object.put("title",oldName);
        return object;
    }
}
