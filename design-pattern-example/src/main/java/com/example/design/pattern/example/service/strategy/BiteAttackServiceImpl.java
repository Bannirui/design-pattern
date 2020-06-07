package com.example.design.pattern.example.service.strategy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class BiteAttackServiceImpl implements AttackService {
    @Override
    public void attack() {
        System.out.println("攻击方式：咬");
    }
}
