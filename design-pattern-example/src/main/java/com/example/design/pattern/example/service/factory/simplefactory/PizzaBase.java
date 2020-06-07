package com.example.design.pattern.example.service.factory.simplefactory;

import lombok.Data;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/2
 * @Description:
 */
@Data
public abstract class PizzaBase {

    // 披萨名字
    protected String name;

    // 原材料准备 不同的披萨原材料不一样 抽象方法 延迟到子类实现
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 烘焙");
    }

    public void cut() {
        System.out.println(name + " 切割");
    }

    public void box() {
        System.out.println(name + " 打包");
    }

}
