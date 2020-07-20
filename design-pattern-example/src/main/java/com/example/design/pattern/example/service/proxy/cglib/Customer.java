package com.example.design.pattern.example.service.proxy.cglib;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: 被代理类 不实现接口 找对象
 */
public class Customer {

    public void findLove() {
        System.out.println("被代理对象：找对象");
    }

}
