package com.example.demo.service;





import com.example.demo.common.ReturnResult;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/4 9:46
 * @Version 1.0
 */

public interface UserInterface {
    ReturnResult userLogin(HttpServletRequest request,String username, String password);
}
