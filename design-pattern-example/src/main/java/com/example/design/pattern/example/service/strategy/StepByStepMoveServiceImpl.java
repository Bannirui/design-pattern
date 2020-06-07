package com.example.design.pattern.example.service.strategy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class StepByStepMoveServiceImpl implements MoveService {
    @Override
    public void move() {
        System.out.println("移动方式：一步一步");
    }
}
