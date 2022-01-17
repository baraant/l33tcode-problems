package com.github.baraant.l33tcode.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/*
    Binary Tree Level Order Traversal

    Solution
    Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



    Example 1:


    Input: root = [3,9,20,null,null,15,7]
    Output: [[3],[9,20],[15,7]]
    Example 2:

    Input: root = [1]
    Output: [[1]]
    Example 3:

    Input: root = []
    Output: []


    Constraints:

    The number of nodes in the tree is in the range [0, 2000].
    -1000 <= Node.val <= 1000
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