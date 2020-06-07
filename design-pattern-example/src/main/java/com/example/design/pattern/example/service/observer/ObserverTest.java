package com.example.design.pattern.example.service.observer;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Task1 task1 = new Task1();
        subject.addObserver(task1);

        Task2 task2 = new Task2();
        subject.addObserver(task2);

        subject.notifyObserver("主题发生变化，通知观察者");

    }
}
