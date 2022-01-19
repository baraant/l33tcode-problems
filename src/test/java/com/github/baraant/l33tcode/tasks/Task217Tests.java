package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task217Tests {

    @Test
    public void test217_1() {
        Task217 task217 = new Task217();

        int[] nums = new int[]{1, 2, 3, 1};

        System.out.println(task217.containsDuplicate(nums));
    }
}
