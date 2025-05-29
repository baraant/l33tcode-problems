package com.github.baraant.l33tcode.data_structures.linked_list;

public class ListNode {
    int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void next(ListNode node) {
        this.next = node;
    }
}