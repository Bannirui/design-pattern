package com.example.design.pattern.example.service.strategy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class FlagZombie extends Zombie {

    public FlagZombie() {
        super(new StepByStepMoveServiceImpl(), new BiteAttackServiceImpl());
    }

    public FlagZombie(MoveService moveService, AttackService attackService) {
        super(moveService, attackService);
    }

    @Override
    public void display() {
        System.out.println("旗手僵尸");
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
