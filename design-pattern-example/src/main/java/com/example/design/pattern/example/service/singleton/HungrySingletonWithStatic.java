package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 饿汉模式 静态代码块
 */
@Service
public class HungrySingletonWithStatic {

    /**
     * 构造器私有化，外部不能new
     */
    private HungrySingletonWithStatic() {}

    /**
     * 本类内部创建对象实例
     */
    private static HungrySingletonWithStatic instance;

    /**
     * 静态代码块中创建单例对象
     */
    static {
        instance = new HungrySingletonWithStatic();
    }

    /**
     * 提供一个公有静态方法，返回实例对象
     * @return
     */
    public static HungrySingletonWithStatic getInstance() {
        return instance;
    }
}
