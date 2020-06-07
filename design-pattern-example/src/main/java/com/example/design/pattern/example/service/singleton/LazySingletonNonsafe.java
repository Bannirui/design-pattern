package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 单例模式 懒汉模式 线程不安全
 */
@Service
public class LazySingletonNonsafe {

    private static LazySingletonNonsafe instance;

    private LazySingletonNonsafe() {
    }

    /**
     * 提供一个静态公有方法，当使用该方法时才去创建instance 懒汉式
     */
    public static LazySingletonNonsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonNonsafe();
        }
        return instance;
    }
}