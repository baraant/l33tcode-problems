package com.github.kollaps92.l33tcode.data_structure_tree;


public class MyTreeNode {
    int val;
    MyTreeNode left;
    MyTreeNode right;

    MyTreeNode() {
    }

    MyTreeNode(int val) {
        this.val = val;
    }

    MyTreeNode(int val, MyTreeNode left, MyTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
