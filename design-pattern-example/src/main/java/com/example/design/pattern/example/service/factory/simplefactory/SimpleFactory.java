package com.example.design.pattern.example.service.factory.simplefactory;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description:
 */
public class SimpleFactory {

    public PizzaBase createPizza(String orderType) {
        PizzaBase pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
