package com.example.design.pattern.example.service.strategy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class NormalZombie extends Zombie {

    public NormalZombie() {
        super(new StepByStepMoveServiceImpl(), new BiteAttackServiceImpl());
    }

    public NormalZombie(MoveService moveService, AttackService attackService) {
        super(moveService, attackService);
    }

    @Override
    public void display() {
        System.out.println("普通僵尸");
    }

    @Override
    void move() {
        moveService.move();
    }

    @Override
    void attack() {
        attackService.attack();
    }
}
