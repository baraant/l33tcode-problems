package com.github.kollaps92.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArrayTests {

    RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();

    @Test
    public void test() {

        int[] nums = IntStream.of(0, 0, 1, 2, 3, 4, 4, 4, 6).toArray();

        int resultedLength = rdfsa.removeDuplicates(nums);
        System.out.println("Hi");
    }

    @Test
    public void test_2() {

        int[] nums = IntStream.of(1).toArray();

        int resultedLength = rdfsa.removeDuplicates(nums);
        System.out.println("Hi");
    }

    @Test
    public void test_3() {

        int[] nums = IntStream.of(1, 1, 1, 1, 1, 1, 1).toArray();

        int resultedLength = rdfsa.removeDuplicates(nums);
        System.out.println("Hi");
    }

    @Test
    public void test_4() {

        int[] nums = IntStream.of(1, 1, 1, 1, 1, 1, 5).toArray();

        int resultedLength = rdfsa.removeDuplicates(nums);
        System.out.println("Hi");
    }

    @Test
    public void test_5() {

        int[] nums = IntStream.of(0, 1, 1, 1, 1, 1, 1).toArray();

        int resultedLength = rdfsa.removeDuplicates(nums);
        System.out.println("Hi");
    }
}
