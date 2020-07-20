package com.example.design.pattern.example.service.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: 婚介机构 代理找对象
 */
public class Agent implements InvocationHandler {

    /**
     * 被代理对象target
     */
    private Object target;

    /**
     * 获取代理对象
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    /**
     * 实现InvocationHandler接口
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    /**
     * 动态代理方法增强 之前
     */
    public void before() {
        System.out.println("jdk动态代理：方法之前增强");
    }

    /**
     * 动态代理方法增强 之后
     */
    public void after() {
        System.out.println("jdk动态代理：方法之后增强");
    }
}
