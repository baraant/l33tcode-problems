package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Test;

public class Task49Tests {

    private static final Task49 task49 = new Task49();

    @Test
    public void test() {
        task49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
}
