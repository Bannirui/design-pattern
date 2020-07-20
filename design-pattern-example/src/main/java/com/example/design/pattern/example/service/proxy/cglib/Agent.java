package com.example.design.pattern.example.service.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/24
 * @Description: 婚介结构 代理找对象
 * cglib方式 实现MethodInterceptor接口 方法拦截器
 */
public class Agent implements MethodInterceptor {

    /**
     * 获取代理
     * @param clazz
     * @return
     * @throws Exception
     */
    public Object getInstance(Class<?> clazz) throws Exception {
        // 增强器
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 实现MethodInterceptor接口
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        after();
        return invokeSuper;
    }

    /**
     * 动态代理方法增强 之前
     */
    public void before() {
        System.out.println("cglib动态代理：方法之前增强");
    }

    /**
     * 动态代理方法增强 之后
     */
    public void after() {
        System.out.println("cglib动态代理：方法之后增强");
    }
}
