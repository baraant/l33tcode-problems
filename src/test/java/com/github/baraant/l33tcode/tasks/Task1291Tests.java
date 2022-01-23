package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task1291Tests {

    @Test
    public void test1291_1() {
        Task1291 task1291 = new Task1291();

        System.out.println(task1291.sequentialDigits(10, 1000000));
    }

    @Test
    public void test1291_2() {
        Task1291 task1291 = new Task1291();

        System.out.println(task1291.sequentialDigits(10, 1000000000));
    }
}
