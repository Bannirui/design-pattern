package com.example.design.pattern.example.service.builder;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public interface PersonBuilder {
    void builderHead(String head);
    void builderEye(String eye);
    void builderHand(String hand);
    void builderLeg(String leg);

    Person build();
}
