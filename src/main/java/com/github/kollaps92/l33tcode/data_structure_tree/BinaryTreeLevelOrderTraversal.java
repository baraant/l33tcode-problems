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
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        List<TreeNode> initialLevelNodes = new ArrayList<>();
        initialLevelNodes.add(root);
        result.add(calculateAllValuesForNodes(initialLevelNodes));

        traverseThroughTheLevel(initialLevelNodes, result);

        return result;
    }

    private void traverseThroughTheLevel(List<TreeNode> currentNodes, List<List<Integer>> result) {
        List<TreeNode> childrenNodes = calculateAllChildrenForCurrentLevel(currentNodes);

        if (childrenNodes != null) {
            result.add(calculateAllValuesForNodes(childrenNodes));

            traverseThroughTheLevel(childrenNodes, result);
        }
    }

    private List<TreeNode> calculateAllChildrenForCurrentLevel(List<TreeNode> currentNodes) {
        List<TreeNode> childrenNodes = new ArrayList<>();

        for (TreeNode node : currentNodes) {
            if (node.left != null) {
                childrenNodes.add(node.left);
            }

            if (node.right != null) {
                childrenNodes.add(node.right);
            }
        }

        return childrenNodes.isEmpty() ? null : childrenNodes;
    }

    private List<Integer> calculateAllValuesForNodes(List<TreeNode> currentNodes) {
        List<Integer> currentValues = new ArrayList<>();

        for (TreeNode node: currentNodes) {
            currentValues.add(node.val);
        }
        return currentValues;
    }
}