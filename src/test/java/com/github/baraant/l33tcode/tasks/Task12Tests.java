package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task12Tests {

    private final Task12 task12 = new Task12();

    @Test
    public void test12_1() {
        Assertions.assertEquals("MMMDCCXLIX", task12.intToRoman(3749));
    }
}
