package com.example.design.pattern.example.service.singleton;

import org.junit.jupiter.api.Test;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description:
 */
class HungrySingletonTest {

    @Test
    void getInstance() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }
}