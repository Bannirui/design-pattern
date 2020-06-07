package com.example.design.pattern.example.service.flyweight;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class FlyweightTest {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3, 4, TreeFactory.getTree("a", "detail info for a"));
        TreeNode treeNode2 = new TreeNode(5, 4, TreeFactory.getTree("a", "detail info for a"));
    }
}
