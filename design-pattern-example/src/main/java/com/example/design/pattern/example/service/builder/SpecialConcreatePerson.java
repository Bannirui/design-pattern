package com.example.design.pattern.example.service.builder;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class SpecialConcreatePerson implements PersonBuilder {

    private String head;
    private String eye;
    private String hand;
    private String leg;

    @Override
    public void builderHead(String head) {
        this.head = "special " + head;
    }

    @Override
    public void builderEye(String eye) {
        this.eye = "special " + eye;
    }

    @Override
    public void builderHand(String hand) {
        this.hand = "special " + hand;
    }

    @Override
    public void builderLeg(String leg) {
        this.leg = "special " + leg;
    }

    @Override
    public Person build() {
        return new Person(this.head, this.eye, this.hand, this.leg);
    }
}
