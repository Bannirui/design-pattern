package com.example.design.pattern.example.service.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description:
 */
class LazySingletonTest {

    @Autowired
    private LazySingleton lazySingleton;

    @Test
    void getInstance() {
        // 多线程模式
        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(() -> {
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}