package com.github.baraant.l33tcode.data_structures.strings;

import org.junit.jupiter.api.Test;

public class ReverseStringTests {

    ReverseString rs = new ReverseString();

    @Test
    public void test() {
        char[] s = "hello".toCharArray();

        rs.reverseString(s);
        System.out.println(s);
    }

    @Test
    public void test_02() {
        char[] s = "Hannah".toCharArray();

        rs.reverseString(s);
        System.out.println(s);
    }
}
