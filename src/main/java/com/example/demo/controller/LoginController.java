package com.example.demo.controller;

import com.example.demo.common.ReturnResult;
import com.example.demo.service.impl.UserInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/1 14:44
 * @Version 1.0
 */
@Controller
public class LoginController {
    @Autowired
    private UserInterfaceImpl userInterface;

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
    public Object loginAct(HttpServletRequest request,@RequestParam String username,String password){
        ReturnResult returnResult = userInterface.userLogin(request,username, password);
        return returnResult;
    }
}
