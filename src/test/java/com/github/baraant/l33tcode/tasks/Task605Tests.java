package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task605Tests {

    @Test
    public void test605_1() {
        Task605 task605 = new Task605();

        int[] nums = new int[]{1, 0, 0, 0, 1};

        System.out.println(task605.canPlaceFlowers(nums, 1));
    }

    @Test
    public void test605_2() {
        Task605 task605 = new Task605();

        int[] nums = new int[]{0};

        task605.canPlaceFlowers(nums, 1);

        System.out.println(task605.canPlaceFlowers(nums, 1));
    }
}
