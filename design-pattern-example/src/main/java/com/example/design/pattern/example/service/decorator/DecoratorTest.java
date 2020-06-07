package com.example.design.pattern.example.service.decorator;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class DecoratorTest {
    public static void main(String[] args) {

        ComponentService componentService = new ConcreateDecorator(new ComponentServiceImpl());

        componentService.operate();
    }
}
