package com.github.baraant.l33tcode.tasks;

/*
48. Rotate Image
Medium
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:

Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
*/
public class Task48 {
    public void rotate(int[][] matrix) {
        int rowSize = matrix.length;
        int steps = rowSize / 2;

        for (int i = 0; i < steps; i++) {
            rotateHelper(matrix, i);
        }
    }

    private void rotateHelper(int[][] matrix, int step) {
        int maxIndex = matrix.length - 1;

        for (int i = 0; i <= maxIndex - 2 * step - 1; i++) {
            int valTl = matrix[step][i + step];
            int valTr = matrix[i + step][maxIndex - step];
            int valBl = matrix[maxIndex - i - step][step];
            int valBr = matrix[maxIndex - step][maxIndex - i - step];

            matrix[step][i + step] = valBl;
            matrix[i + step][maxIndex - step] = valTl;
            matrix[maxIndex - i - step][step] = valBr;
            matrix[maxIndex - step][maxIndex - i - step] = valTr;
        }
    }
}
