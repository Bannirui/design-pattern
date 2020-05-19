package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 静态内部类
 * 本质利用类加载机制保证线程安全
 * 只有在实际使用的时候才触发初始化，也是懒加载的一种形式
 */
@Service
public class InnerClassSingleton {

    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {}

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
