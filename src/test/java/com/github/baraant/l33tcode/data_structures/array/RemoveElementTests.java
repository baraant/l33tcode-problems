package com.github.baraant.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class RemoveElementTests {

    RemoveElement re = new RemoveElement();

    @Test
    public void test() {
        int[] nums = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).toArray();

        int resultedLength = re.removeElement(nums, 2);
        System.out.println("Hi");
    }

    @Test
    public void test_2() {
        int[] nums = IntStream.of(2).toArray();

        int resultedLength = re.removeElement(nums, 2);
        System.out.println("Hi");
    }

    @Test
    public void test_3() {
        int[] nums = IntStream.of(2, 2, 0, 2).toArray();

        int resultedLength = re.removeElement(nums, 2);
        System.out.println("Hi");
    }
}
