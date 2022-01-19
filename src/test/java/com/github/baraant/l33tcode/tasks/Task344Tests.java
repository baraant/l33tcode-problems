package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task344Tests {

    @Test
    public void test344_1() {
        Task344 task344 = new Task344();

        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        task344.reverseString(chars);

        System.out.println(Arrays.toString(chars));
    }
}
