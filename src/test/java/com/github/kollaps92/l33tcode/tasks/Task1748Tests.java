package com.github.kollaps92.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task1748Tests {

    @Test
    public void test1748_1() {
        Task1748 task1748 = new Task1748();

        int[] sums = new int[]{1, 2, 3, 2};

        System.out.println(task1748.sumOfUnique(sums));
    }

    @Test
    public void test1748_2() {
        Task1748 task1748 = new Task1748();

        int[] sums = new int[]{1, 1, 1, 1, 1};

        System.out.println(task1748.sumOfUnique(sums));
    }
}
