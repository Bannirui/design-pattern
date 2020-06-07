package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 单例模式 饿汉模式(静态变量)
 */
@Service
public class HungrySingleton {

    /**
     * 构造器私有化，外部不能new
     */
    private HungrySingleton() {}

    /**
     * 本类的内部创建对象实例
     *
     * 类加载的初始化阶段完成实例的初始化
     * 本质上就是借助于jvm类加载机制保证实例唯一性
     */
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 提供一个公有的静态方法，返回实例化对象
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
