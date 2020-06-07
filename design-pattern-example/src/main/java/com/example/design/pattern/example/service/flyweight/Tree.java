package com.example.design.pattern.example.service.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description: 树
 */
@Getter
@AllArgsConstructor
public class Tree {
    private final String name;
    private final String data;
}
