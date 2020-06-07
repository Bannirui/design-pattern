package com.example.design.pattern.example.service.factory.simplefactory;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description:
 */
public class CheesePizza extends PizzaBase {
    @Override
    public void prepare() {
        System.out.println("奶酪披萨准备原材料");
    }
}
