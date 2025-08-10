package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task869Tests {

    private final Task869 task869 = new Task869();

    @Test
    public void test() {
        Assertions.assertTrue(task869.reorderedPowerOf2(4914340));
    }
}
