package com.example.design.pattern.example.service.singleton;

import org.springframework.stereotype.Service;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/19
 * @Description: 单例模式 懒汉模式(双重检查) 延迟加载
 */
@Service
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，解决了效率问题
     *
     * 单线程下单例模式肯定没问题
     * 多线程并发会导致实例化对象不是同一个
     * 方法加锁粒度太大
     * 双重判断
     */
    public static LazySingleton getInstance() {
        // 没有实例化才进行实例化 否则直接return
        if (instance == null) {
            // 多线程加锁
            synchronized (LazySingleton.class) {
                // 双重判断
                if (instance == null) {
                    instance = new LazySingleton();
                    /**
                     * 初始化对象时
                     * 1，加载检查
                     * 2，分配空间
                     * 3，初始化0值
                     * 4，加载头信息
                     * 5，init
                     * 可能发生指令重排
                     * 分配空间->初始化->引用赋值
                     * 分配空间->引用赋值->初始化
                     * 导致第1下线程在实例化过程中时第2个线程进来判断条件instance!=null而直接返回，但是此时instance依然为空，导致空指针
                     * 需要计入volatile保证一致性，防止重排序
                     */
                }
            }
        }
        return instance;
    }
}
