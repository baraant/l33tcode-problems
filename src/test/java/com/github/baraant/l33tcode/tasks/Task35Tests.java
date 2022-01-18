package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task35Tests {

    @Test
    public void test35_1() {
        Task35 task35 = new Task35();

        int[] nums = new int[]{1, 3, 5, 6};

        System.out.println(task35.searchInsert(nums, 7));
    }

    @Test
    public void test35_2() {
        Task35 task35 = new Task35();

        int[] nums = new int[]{1};

        System.out.println(task35.searchInsert(nums, 1));
    }
}
