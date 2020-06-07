package com.example.design.pattern.example.service.templatemethod;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public abstract class AbstractClass {

    /**
     * 抽象类预处理实现
     */
    public void operate() {
        System.out.println("预处理...");
        templateMethod();
    }

    /**
     * 延迟到子类实现
     */
    abstract protected void templateMethod();
}
