package com.github.baraant.l33tcode.tasks;

/*
2. Add Two Numbers
Medium
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/
public class Task2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean addOne = false;
        ListNode newHead = new ListNode();
        ListNode l1Cur = l1;
        ListNode l2Cur = l2;
        ListNode l3Cur = newHead;

        while (l1Cur != null || l2Cur != null) {
            int l1Val = l1Cur == null ? 0 : l1Cur.val;
            int l2Val = l2Cur == null ? 0 : l2Cur.val;

            int sum = l1Val + l2Val;
            if (addOne) sum++;

            if (sum >= 10) {
                addOne = true;
                sum -= 10;
            } else {
                addOne = false;
            }

            l3Cur.next = new ListNode(sum);
            l3Cur = l3Cur.next;
            if (l1Cur != null) {
                l1Cur = l1Cur.next;
            }

            if (l2Cur != null) {
                l2Cur = l2Cur.next;
            }
        }

        if (addOne) {
            l3Cur.next = new ListNode(1);
        }

        return newHead.next;
    }
}
