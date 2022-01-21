package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task121Tests {

    @Test
    public void test121_1() {
        Task121 task121 = new Task121();

        int[] nums = new int[]{7, 6, 4, 3, 1};

        System.out.println(task121.maxProfit(nums));
    }

    @Test
    public void test121_2() {
        Task121 task121 = new Task121();

        int[] nums = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(task121.maxProfit(nums));
    }

    @Test
    public void test121_3() {
        Task121 task121 = new Task121();

        int[] nums = new int[]{1, 2};

        System.out.println(task121.maxProfit(nums));
    }
}
