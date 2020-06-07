package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 懒汉模式 同步方法
 */
@Service
public class LazySingletonWithSyncMethod {

    private static LazySingletonWithSyncMethod instance;

    private LazySingletonWithSyncMethod() {
    }

    /**
     * 提供一个静态的公有方法 加入同步处理的代码 解决线程安全问题
     */
    public static synchronized LazySingletonWithSyncMethod getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithSyncMethod();
        }
        return instance;
    }
}
