package com.github.baraant.l33tcode.data_structures.linked_list;

import org.junit.jupiter.api.Test;

public class ReverseLinkedListTests {

    @Test
    public void test() {
        ReverseLinkedList rn = new ReverseLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next(node2);
        node2.next(node3);

        ListNode resultNode = rn.reverseList(node1);
        System.out.println("Hi");
    }
}
