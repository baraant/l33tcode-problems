package com.github.kollaps92.l33tcode.data_structure_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(MyTreeNode root) {
        List<Integer> result = new ArrayList<>();

        getNodeValueAndFindNext(root, result);

        return result;
    }

    private void getNodeValueAndFindNext(MyTreeNode current, List<Integer> result) {
        if (current != null) {
            result.add(current.val);

            if (current.left != null) {
                getNodeValueAndFindNext(current.left, result);
            }

            if (current.right != null) {
                getNodeValueAndFindNext(current.right, result);
            }
        }
    }
}