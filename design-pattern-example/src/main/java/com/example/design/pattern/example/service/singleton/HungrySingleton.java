package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 单例模式 饿汉模式
 */
@Service
public class HungrySingleton {

    /**
     * 类加载的初始化阶段完成实例的初始化
     * 本质上就是借助于jvm类加载机制保证实例唯一性
     */
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
