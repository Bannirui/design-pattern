package com.example.design.pattern.example.service.chainofresponsibility;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/1
 * @Description:
 */
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Request request = new Request.RequestBuilder()
                .isFrequentOK(true)
                .isLoginOk(false)
                .build();

        RequestFrequentHandler requestFrequentHandler = new RequestFrequentHandler(new LoginHandler(null));

        if (requestFrequentHandler.process(request)) {
            System.out.println("正常业务处理");
        } else {
            System.out.println("访问异常");
        }
    }
}
