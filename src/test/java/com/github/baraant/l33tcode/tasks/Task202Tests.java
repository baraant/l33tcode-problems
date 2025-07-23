package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task202Tests {

    private static final Task202 task202 = new Task202();

    @Test
    public void test202_1() {
        Assertions.assertTrue(task202.isHappy(19));
    }
}
