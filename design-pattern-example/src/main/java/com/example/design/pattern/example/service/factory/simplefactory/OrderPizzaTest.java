package com.example.design.pattern.example.service.factory.simplefactory;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description:
 */
public class OrderPizzaTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        OrderPizza orderPizza = new OrderPizza(simpleFactory);
    }
}
