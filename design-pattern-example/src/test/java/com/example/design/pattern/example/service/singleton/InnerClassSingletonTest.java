package com.example.design.pattern.example.service.singleton;

import org.junit.jupiter.api.Test;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description:
 */
class InnerClassSingletonTest {

    @Test
    void getInstance() {
        new Thread(() -> {
            System.out.println(InnerClassSingleton.getInstance());
        }).start();

        new Thread(() -> {
            System.out.println(InnerClassSingleton.getInstance());
        }).start();
    }
}