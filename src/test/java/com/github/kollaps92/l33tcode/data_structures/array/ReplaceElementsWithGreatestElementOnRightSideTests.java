package com.github.kollaps92.l33tcode.data_structures.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ReplaceElementsWithGreatestElementOnRightSideTests {

    ReplaceElementsWithGreatestElementOnRightSide rewgeors = new ReplaceElementsWithGreatestElementOnRightSide();

    @Test
    public void test() {
        int[] arr = IntStream.of(17, 18, 5, 4, 6, 1).toArray();

        rewgeors.replaceElements(arr);
        System.out.println("Hi");
    }

    @Test
    public void test_2() {
        int[] arr = IntStream.of(400).toArray();

        rewgeors.replaceElements(arr);
        System.out.println("Hi");
    }
}
