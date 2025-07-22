package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1695Tests {

    private static final Task1695 task1695 = new Task1695();

    @Test
    public void test1695_1() {

        int[] nums = new int[]{4, 2, 4, 5, 6};

        Assertions.assertEquals(17, task1695.maximumUniqueSubarray(nums));

    }

    @Test
    public void test1695_2() {

        int[] nums = new int[]{187, 470, 25, 436, 538, 809, 441, 167, 477, 110, 275, 133, 666, 345, 411, 459, 490, 266,
                987, 965, 429, 166, 809, 340, 467, 318, 125, 165, 809, 610, 31, 585, 970, 306, 42, 189, 169, 743, 78,
                810, 70, 382, 367, 490, 787, 670, 476, 278, 775, 673, 299, 19, 893, 817, 971, 458, 409, 886, 434};

        Assertions.assertEquals(16911, task1695.maximumUniqueSubarray(nums));
    }
}
