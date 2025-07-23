package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1717Tests {
    private static final Task1717 task1717 = new Task1717();

    @Test
    public void test1717_1() {
        Assertions.assertEquals(20, task1717.maximumGain("aabbaaxybbaabb", 5, 4));
    }

    @Test
    public void test1717_2() {
        Assertions.assertEquals(19, task1717.maximumGain("cdbcbbaaabab", 4, 5));
    }
}
