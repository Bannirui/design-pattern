package com.example.design.pattern.example.service.observer;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class Task2 implements ObserverService {
    @Override
    public void update(Object object) {
        System.out.println("task2 receive>>>" + object);
    }
}
