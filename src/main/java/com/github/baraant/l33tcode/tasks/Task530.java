package com.github.baraant.l33tcode.tasks;

/*
530. Minimum Absolute Difference in BST
Easy
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

Example 1:

Input: root = [4,2,6,1,3]
Output: 1
Example 2:

Input: root = [1,0,48,null,null,12,49]
Output: 1

Constraints:

The number of nodes in the tree is in the range [2, 10^4].
0 <= Node.val <= 10^5
*/
public class Task530 {
    private TreeNode prev;
    private int minVal = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return minVal;
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);

        if (prev != null) {
            minVal = Math.min(minVal, node.val - prev.val);
        }
        prev = node;

        inorderTraversal(node.right);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
