package com.example.design.pattern.example.service.proxy.jdk;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: jdk动态代理测试
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理 向上转型 接口类型
        Person proxy = (Person) new Agent().getInstance(new Customer());
        proxy.sayHello();
        proxy.findLove();
    }
}
