package com.example.design.pattern.example.service.builder;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class DefaultConcreatePerson implements PersonBuilder {

    private String head;
    private String eye;
    private String hand;
    private String leg;

    @Override
    public void builderHead(String head) {
        this.head = "default " + head;
    }

    @Override
    public void builderEye(String eye) {
        this.eye = "default " + eye;
    }

    @Override
    public void builderHand(String hand) {
        this.hand = "default " + hand;
    }

    @Override
    public void builderLeg(String leg) {
        this.leg = "default " + leg;
    }

    @Override
    public Person build() {
        return new Person(this.head, this.eye, this.hand, this.leg);
    }
}
