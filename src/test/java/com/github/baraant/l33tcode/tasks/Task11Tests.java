package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task11Tests {

    private final Task11 task11 = new Task11();

    @Test
    public void test11_1() {
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assertions.assertEquals(49, task11.maxArea(heights));
    }

    @Test
    public void test11_2() {
        int[] heights = new int[]{2, 3, 4, 5, 18, 17, 6};
        Assertions.assertEquals(17, task11.maxArea(heights));
    }
}
