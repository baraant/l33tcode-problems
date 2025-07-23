package com.github.baraant.l33tcode.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task392Tests {

    private static final Task392 task392 = new Task392();

    @Test
    public void asd() {
        Assertions.assertFalse(task392.isSubsequence("aaaaaa", "bbaaaa"));
    }
}
