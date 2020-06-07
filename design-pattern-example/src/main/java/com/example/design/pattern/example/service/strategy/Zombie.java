package com.example.design.pattern.example.service.strategy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public abstract class Zombie {

    protected MoveService moveService;
    protected AttackService attackService;

    public MoveService getMoveService() {
        return moveService;
    }

    public void setMoveService(MoveService moveService) {
        this.moveService = moveService;
    }

    public AttackService getAttackService() {
        return attackService;
    }

    public void setAttackService(AttackService attackService) {
        this.attackService = attackService;
    }

    abstract public void display();

    abstract void move();
    abstract void attack();

    public Zombie(MoveService moveService, AttackService attackService) {
        this.moveService = moveService;
        this.attackService = attackService;
    }
}
