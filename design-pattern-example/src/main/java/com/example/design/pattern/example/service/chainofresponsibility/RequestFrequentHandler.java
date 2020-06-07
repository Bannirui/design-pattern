package com.example.design.pattern.example.service.chainofresponsibility;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/1
 * @Description:
 */
public class RequestFrequentHandler extends Handler {
    public RequestFrequentHandler(Handler next) {
        super(next);
    }

    @Override
    boolean process(Request request) {
        System.out.println("访问频率控制");
        if (request.isFrequentOK()) {
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
