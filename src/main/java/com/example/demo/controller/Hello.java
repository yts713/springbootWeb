package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/1 14:44
 * @Version 1.0
 */
@Controller
public class Hello {
    @RequestMapping("/hello")
    @ResponseBody
    public Object sayHello(@RequestParam String name){
        return "hello! "+name;
    }
    @RequestMapping("/helloPage")
    public Object returnHelloPage(){
        return "hello";
    }
    @RequestMapping("/login")
    public Object loginPage(){
        return "login";
    }
}
