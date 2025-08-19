package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2348Tests {

    private final Task2348 task2348 = new Task2348();

    @Test
    public void test() {

        int[] nums = new int[] {0,0,0,2,0,0};

        Assertions.assertEquals(9, task2348.zeroFilledSubarray(nums));
    }
}
