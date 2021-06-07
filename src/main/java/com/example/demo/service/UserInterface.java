package com.example.demo.service;





import javax.servlet.http.HttpServletRequest;
import javax.websocket.Session;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/4 9:46
 * @Version 1.0
 */

public interface UserInterface {
    String userLogin(String username, String password);
}
