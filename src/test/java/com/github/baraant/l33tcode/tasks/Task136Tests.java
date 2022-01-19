package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task136Tests {

    @Test
    public void test136_1() {
        Task136 task136 = new Task136();

        int[] nums = new int[]{2, 2, 1};

        System.out.println(task136.singleNumber(nums));
    }
}
