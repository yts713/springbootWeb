package com.example.demo.controller;

import com.example.demo.common.ReturnResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/1 14:44
 * @Version 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/hello")
    @ResponseBody
    public Object sayHello(@RequestParam String name){
        return "hello! "+name;
    }
    @RequestMapping("/helloPage")
    public Object returnHelloPage(){
        return "loginController";
    }
    @RequestMapping("/login")
    public Object loginPage(){
        return "login";
    }
    @RequestMapping("/loginAct")
    @ResponseBody
    public Object loginAct(HttpServletRequest request, @RequestParam String username, @RequestParam String password){
        ReturnResult returnResult = new ReturnResult();
        return returnResult;
    }
}
