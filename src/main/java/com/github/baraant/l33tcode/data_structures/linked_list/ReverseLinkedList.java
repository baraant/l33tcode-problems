package com.github.baraant.l33tcode.data_structures.linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return null;
        }

        return revertNode(head, null);
    }

    private ListNode revertNode(ListNode node, ListNode previous) {
        ListNode newInitialNode;

        if (node.next == null) {
            node.next = previous;
            return node;
        }

        newInitialNode = revertNode(node.next, node);
        node.next = previous;

        return newInitialNode;
    }
}