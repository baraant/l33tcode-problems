package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task283Tests {

    @Test
    public void test283_1() {
        Task283 task283 = new Task283();

        int[] nums = new int[]{0, 1, 0, 3, 12};
        task283.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

}
