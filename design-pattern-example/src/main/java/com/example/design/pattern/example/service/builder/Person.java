package com.example.design.pattern.example.service.builder;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/20
 * @Description:
 */
public class Person {

    private String head;
    private String eye;
    private String hand;
    private String leg;

    public Person() {
    }

    public Person(String head, String eye, String hand, String leg) {
        this.head = head;
        this.eye = eye;
        this.hand = hand;
        this.leg = leg;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", eye='" + eye + '\'' +
                ", hand='" + hand + '\'' +
                ", leg='" + leg + '\'' +
                '}';
    }
}
