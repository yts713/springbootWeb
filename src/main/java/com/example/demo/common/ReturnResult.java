package com.example.demo.common;

/**
 * @ClassName yts
 * @Description
 * @Date 2021/6/4 9:42
 * @Version 1.0
 */
public class ReturnResult {
    String flag;
    String message;

    @Override
    public String toString() {
        return "ReturnResult{" +
                "flag='" + flag + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
