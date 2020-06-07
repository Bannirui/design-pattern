package com.example.design.pattern.example.service.adapter.object;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.output5v();
    }
}
