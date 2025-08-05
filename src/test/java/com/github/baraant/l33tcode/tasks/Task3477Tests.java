package com.github.baraant.l33tcode.tasks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3477Tests {

    private static final Task3477 task3477 = new Task3477();

    @Test
    public void test() {

        int[] fruits = new int[] {4,2,5};
        int[] baskets = new int[] {3,5,4};

        Assertions.assertEquals(1, task3477.numOfUnplacedFruits(fruits, baskets));
    }
}
