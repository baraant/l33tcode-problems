package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task53Tests {

    @Test
    public void test53_1() {
        Task53 task53 = new Task53();

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(task53.maxSubArray(nums));
    }
}
