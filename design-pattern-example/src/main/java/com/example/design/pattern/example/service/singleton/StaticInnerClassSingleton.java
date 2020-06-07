package com.example.design.pattern.example.service.singleton;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description: 静态内部类
 */
public class StaticInnerClassSingleton {

    /**
     * 私有化构造函数
     */
    private StaticInnerClassSingleton() {}

    /**
     * 静态内部类，该类中有一个静态属性StaticInnerClassSingleton
     * StaticInnerClassSingleton装载的时候静态内部类不会被立即装载
     */
    private static class SingletonInstance{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    /**
     * 提供一个静态方法 直接返回静态内部类静态属性
     * @return
     */
    public static StaticInnerClassSingleton getInstance() {
        return SingletonInstance.instance;
    }
}
