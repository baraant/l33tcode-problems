package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task189Tests {

    @Test
    public void test189_1() {
        Task189 task189 = new Task189();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};

        task189.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test189_2() {
        Task189 task189 = new Task189();

        int[] nums = new int[]{-1, -100, 3, 99};

        task189.rotate(nums, 2);

        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test189_3() {
        Task189 task189 = new Task189();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6};

        task189.rotate(nums, 2);

        System.out.println(Arrays.toString(nums));
    }
}
