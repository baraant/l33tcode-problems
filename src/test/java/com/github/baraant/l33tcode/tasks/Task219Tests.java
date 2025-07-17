package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task219Tests {

    private final Task219 task219 = new Task219();

    @Test
    public void test219_1() {

        int[] nums = {1, 2, 3, 1, 2, 3};

        Assertions.assertFalse(task219.containsNearbyDuplicate(nums, 2));
    }

    @Test
    public void test219_2() {

        int[] nums = {1, 2, 3, 1};

        Assertions.assertTrue(task219.containsNearbyDuplicate(nums, 3));
    }

    @Test
    public void test219_3() {

        int[] nums = {1,0,1,1};

        Assertions.assertTrue(task219.containsNearbyDuplicate(nums, 1));
    }
}