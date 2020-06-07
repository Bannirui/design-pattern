package com.example.design.pattern.example.service.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description: 树节点信息 在地图上的位置
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    private Integer x;
    private Integer y;
    private Tree tree;
}
