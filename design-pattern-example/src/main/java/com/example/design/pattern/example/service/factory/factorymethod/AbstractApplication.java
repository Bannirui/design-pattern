package com.example.design.pattern.example.service.factory.factorymethod;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description: 抽象出方法为接口 子类继承抽象类复写抽象方法进行实例化
 * Factory Method能够使一个类的实例化延迟到子类
 * 朱荣处理RocketMQ不同业务消息体处理的方式
 */
public abstract class AbstractApplication {

    abstract Product createProduct();

    public Product getObject() {
        Product product = createProduct();
        return product;
    }
}
