package com.example.design.pattern.example.service.adapter.classes;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description: 类适配器模式 使用继承实现
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int output5v() {
        int i = output220v();
        System.out.println(String.format("原始电压>>>%d 经过一系列操作 输出>>>%d", i, 5));
        return 5;
    }
}
