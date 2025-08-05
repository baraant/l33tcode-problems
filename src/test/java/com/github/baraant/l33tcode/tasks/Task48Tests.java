package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task48Tests {

    private static final Task48 task48 = new Task48();

    @Test
    public void test() {

        int[][] matrix = new int[3][3];

        matrix[0] = new int[]{1,2,3};
        matrix[1] = new int[]{4,5,6};
        matrix[2] = new int[]{7,8,9};

        task48.rotate(matrix);
        System.out.println(matrix);
    }
}
