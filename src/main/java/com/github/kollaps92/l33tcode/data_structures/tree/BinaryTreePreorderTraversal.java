package com.github.kollaps92.l33tcode.data_structures.tree;

import java.util.ArrayList;
import java.util.List;

/*
    Binary Tree Preorder Traversal

    Solution
    Given the root of a binary tree, return the preorder traversal of its nodes' values.



    Example 1:


    Input: root = [1,null,2,3]
    Output: [1,2,3]
    Example 2:

    Input: root = []
    Output: []
    Example 3:

    Input: root = [1]
    Output: [1]
    Example 4:


    Input: root = [1,2]
    Output: [1,2]
    Example 5:


    Input: root = [1,null,2]
    Output: [1,2]


    Constraints:

    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
*/

class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        getNodeValueAndFindNext(root, result);

        return result;
    }

    private void getNodeValueAndFindNext(TreeNode current, List<Integer> result) {
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