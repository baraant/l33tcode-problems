package com.github.kollaps92.l33tcode.data_structure_tree;

/*
    Symmetric Tree

    Solution
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



    Example 1:


    Input: root = [1,2,2,3,4,4,3]
    Output: true
    Example 2:


    Input: root = [1,2,2,null,3,null,3]
    Output: false


    Constraints:

    The number of nodes in the tree is in the range [1, 1000].
    -100 <= Node.val <= 100
*/

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return twoNodesShouldBySymmetrical(root.left, root.right);
    }

    private boolean twoNodesShouldBySymmetrical(TreeNode nodeFromLeft, TreeNode nodeFromRight) {

        if (nodeFromLeft == null && nodeFromRight == null) {
            return true;
        }

        if (nodeFromLeft != null && nodeFromRight != null) {
            if (nodeFromLeft.val != nodeFromRight.val) return false;

            boolean result1 = twoNodesShouldBySymmetrical(nodeFromLeft.left, nodeFromRight.right);
            boolean result2 = twoNodesShouldBySymmetrical(nodeFromLeft.right, nodeFromRight.left);

            return result1 && result2;
        } else {
            return false;
        }
    }
}
