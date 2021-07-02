package com.example.demo.controller;

import com.example.demo.service.impl.MiaoShaInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/11 16:51
 * @Version 1.0
 */
@Controller
public class MiaoShaController {
    @Autowired
    private MiaoShaInterfaceImpl miaoShaInterface;
    @RequestMapping("/goodMS")
    @ResponseBody
    public Object miaoSha(){
        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int flag = miaoShaInterface.miaoShaService("realme");
                    if(flag==1){
                        System.out.println("秒杀成功抢到了realme手机");
                    }
                }
            }).start();
        }
        return null;
    }
}
