package com.example.demo.service.impl;

import com.example.demo.common.ReturnResult;
import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import com.example.demo.service.UserInterface;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/4 9:51
 * @Version 1.0
 */
@Service
public class UserInterfaceImpl implements UserInterface {
   @Autowired
    private UserMapper userMapper;
    @Override
    public ReturnResult userLogin(HttpServletRequest request,String username, String password) {
        ReturnResult returnResult = new ReturnResult();
        User user = userMapper.selectByUsernameAndPassword(username, password);
        if(user==null){
            returnResult.setFlag("0");
            returnResult.setMessage("用户账户或密码错误");
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            returnResult.setFlag("1");
            returnResult.setMessage("用户登录成功");
        }
        return returnResult;
    }
}
