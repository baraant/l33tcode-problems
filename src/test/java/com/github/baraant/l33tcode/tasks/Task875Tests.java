package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task875Tests {

    @Test
    public void test875_1() {
        Task875 task875 = new Task875();

        int[] nums = new int[]{3, 6, 7, 11};

        System.out.println(task875.minEatingSpeed(nums, 8));
    }

    @Test
    public void test875_2() {
        Task875 task875 = new Task875();

        int[] nums = new int[]{30, 11, 23, 4, 20};

        System.out.println(task875.minEatingSpeed(nums, 6));
    }

    @Test
    public void test875_3() {
        Task875 task875 = new Task875();

        int[] nums = new int[]{30, 11, 23, 4, 20};

        System.out.println(task875.minEatingSpeed(nums, 5));
    }

    @Test
    public void test875_4() {
        Task875 task875 = new Task875();

        int[] nums = new int[]{1};

        System.out.println(task875.minEatingSpeed(nums, 1));
    }
}
