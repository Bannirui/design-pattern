package com.example.design.pattern.example.service.proxy.cglib;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: cglib动态代理测试
 */
public class Client {
    public static void main(String[] args) {
        try {
            Customer proxy = (Customer) new Agent().getInstance(Customer.class);
            proxy.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
