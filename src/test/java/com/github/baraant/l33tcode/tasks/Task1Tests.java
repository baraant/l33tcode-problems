package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1Tests {

    @Test
    public void test1_1() {
        Task1 task1 = new Task1();

        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(task1.twoSum(nums, 9)));
    }

    @Test
    public void test1_2() {
        Task1 task1 = new Task1();

        int[] nums = new int[]{3,2,4};

        System.out.println(Arrays.toString(task1.twoSum(nums, 6)));
    }

    @Test
    public void test1_3() {
        Task1 task1 = new Task1();

        int[] nums = new int[]{3,3};

        System.out.println(Arrays.toString(task1.twoSum(nums, 6)));
    }
}
