package com.github.baraant.l33tcode.tasks.helpers;

public class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    public TrieNode() {
        isEndOfWord = false;
    }
}