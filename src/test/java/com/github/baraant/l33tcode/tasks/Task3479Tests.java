package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3479Tests {

    private static final Task3479 task3479 = new Task3479();

    @Test
    public void test() {

        int[] fruits = new int[] {4,2,5};
        int[] baskets = new int[] {3,5,4};

        Assertions.assertEquals(1, task3479.numOfUnplacedFruits(fruits, baskets));
    }
}
