package com.example.design.pattern.example.service.factory.abstractfactory;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class ProductBUtils implements UtilsService {
    @Override
    public void connect() {
        System.out.println("Product B connect");
    }

    @Override
    public void command() {
        System.out.println("Product B command");
    }
}
