package com.example.design.pattern.example.service.decorator;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public abstract class Decorator implements ComponentService {

    public ComponentService componentService;

    public Decorator(ComponentService componentService) {
        this.componentService = componentService;
    }
}
