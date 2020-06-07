package com.example.design.pattern.example.service.chainofresponsibility;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/1
 * @Description:
 */
public class LoginHandler extends Handler {
    public LoginHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("登录验证");
        if (request.isLoginOk()) {
            Handler next = getNext();
            if (null==next) {
                return true;
            }
            if (!next.process(request)){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
