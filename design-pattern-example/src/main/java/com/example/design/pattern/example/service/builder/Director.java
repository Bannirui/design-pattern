package com.example.design.pattern.example.service.builder;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class Director {

    private PersonBuilder builder;

    public Director(PersonBuilder builder) {
        this.builder = builder;
    }

    public Person makePerson(String head, String eye, String hand, String leg) {
        builder.builderLeg(leg);
        builder.builderHand(hand);
        builder.builderEye(eye);
        builder.builderHead(head);

        return builder.build();
    }
}