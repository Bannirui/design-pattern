package com.example.design.pattern.example.service.proxy.jdk;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: 接口 找对象
 */
public interface Person {
    default void sayHello() {
        System.out.println("接口方法：打招呼");
    }

    void findLove();
}
