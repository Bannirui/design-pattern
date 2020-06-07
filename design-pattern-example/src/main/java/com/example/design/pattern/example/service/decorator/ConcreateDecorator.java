package com.example.design.pattern.example.service.decorator;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class ConcreateDecorator extends Decorator {

    public ConcreateDecorator(ComponentService componentService) {
        super(componentService);
    }

    @Override
    public void operate() {
        componentService.operate();
        System.out.println("添加美颜功能");
    }
}
