package com.example.design.pattern.example.service.factory.factorymethod;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class ConCreateProductA extends AbstractApplication {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
