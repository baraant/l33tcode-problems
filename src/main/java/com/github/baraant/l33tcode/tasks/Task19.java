package com.github.baraant.l33tcode.tasks;

/*
19. Remove Nth Node From End of List
Medium

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/
public class Task19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 1 && head.next == null) {
            return null;
        }

        int amount = calculateNumberOfNodes(head);

        int nodeToRemove = amount - n + 1;

        if (nodeToRemove == 1) {
            return head.next;
        } else if (nodeToRemove == amount) {
            ListNode cur = head;
            for (int i = 1; i < nodeToRemove - 1; i++) {
                cur = cur.next;
            }
            cur.next = null;
            return head;
        } else {
            ListNode cur = head;
            for (int i = 1; i < nodeToRemove - 1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            return head;
        }
    }

    private int calculateNumberOfNodes(ListNode head) {
        int amount = 1;
        ListNode cur = head;

        while (cur.next != null) {
            amount++;
            cur = cur.next;
        }

        return amount;
    }
}
