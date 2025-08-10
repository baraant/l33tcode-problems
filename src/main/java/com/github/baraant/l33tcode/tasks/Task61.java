package com.github.baraant.l33tcode.tasks;

/*
61. Rotate List
Medium
Given the head of a linked list, rotate the list to the right by k places.

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:

Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 10^9
*/
public class Task61 {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode cur = head;
        int count = 1;

        //figure out the amount of nodes
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }

        k = k % count;

        // if nothing should be moved - return head;
        if (k == 0) {
            return head;
        }

        ListNode prevTail = cur;
        cur = head;

        for (int i = 1; i <= count - k - 1; i++) {
            cur = cur.next;
        }

        ListNode newHead = cur.next;
        cur.next = null;
        prevTail.next = head;

        return newHead;
    }
}
