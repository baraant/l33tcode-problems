package com.github.baraant.l33tcode.tasks.helpers;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    /**
     * Вставляет слово в trie
     */
    public void insert(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    private TrieNode searchNode(String str) {
        TrieNode current = root;

        for (char c : str.toCharArray()) {
            int index = c - 'a';

            if (current.children[index] == null) {
                return null; // префикс не найден
            }

            current = current.children[index];
        }

        return current;
    }
}
