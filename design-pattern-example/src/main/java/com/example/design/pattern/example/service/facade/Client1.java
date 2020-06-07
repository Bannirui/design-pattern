package com.example.design.pattern.example.service.facade;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class Client1 {

    Facade facade = new Facade();

    public void doSomethingFacade() {
        facade.doSomethingFacade();
    }


    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSomethingFacade();
    }

}
