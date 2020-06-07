package com.example.design.pattern.example.service.templatemethod;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class Subclass extends AbstractClass {
    @Override
    protected void templateMethod() {
        System.out.println("子类subClass实现");
    }
}
