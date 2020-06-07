package com.example.design.pattern.example.service.adapter.object;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description: 对象适配器模式 通过组合方式
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output5v() {
        int i = adaptee.output220v();
        System.out.println(String.format("原始电压>>>%d 经过一系列操作 输出>>>%d", i, 5));
        return 5;
    }
}
