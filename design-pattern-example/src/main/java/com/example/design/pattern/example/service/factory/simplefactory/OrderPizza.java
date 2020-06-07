package com.example.design.pattern.example.service.factory.simplefactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description:
 */
public class OrderPizza {
    private SimpleFactory simpleFactory;
    private PizzaBase pizza = null;

    // 无参构造器
    public OrderPizza() {

    }

    public OrderPizza(SimpleFactory simpleFactory) {
        orderSimple(simpleFactory);
    }

    // 订购披萨
    public void orderDirect() {
        PizzaBase pizza = null;

        String orderType;

        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else {
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);

    }

    // 简单工厂方法下单
    public void orderSimple(SimpleFactory simpleFactory) {
        String orderType = "";
        do {
            orderType = getType();
            this.pizza = simpleFactory.createPizza(orderType);

            // 判断
            if (this.pizza != null) {
                this.pizza.prepare();
                this.pizza.bake();
                this.pizza.cut();
                this.pizza.box();
            } else {
                System.out.println("订购失败");
            }
        } while (true);
    }

    // 获取客户希望订购的披萨种类
    public String getType() {
        BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type: ");

        String pizzType;
        try {
            pizzType = strIn.readLine();

        } catch (Exception e) {
            pizzType = "";
            e.printStackTrace();
        }
        return pizzType;
    }
}
