package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task14Tests {

    private final Task14 task14 = new Task14();

    @Test
    public void test14_1() {

        String[] strs = new String[]{"flower", "flow", "flight"};

        Assertions.assertEquals("fl", task14.longestCommonPrefix(strs));
    }
}
