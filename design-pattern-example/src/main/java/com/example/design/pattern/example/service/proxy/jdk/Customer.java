package com.example.design.pattern.example.service.proxy.jdk;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: 被代理类 实现找对象接口
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("被代理对象：找对象");
    }
}
