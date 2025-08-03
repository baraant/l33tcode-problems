package com.github.baraant.l33tcode.tasks;

/*
21. Merge Two Sorted Lists
Easy

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
*/
public class Task21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Cur = list1;
        ListNode list2Cur = list2;

        ListNode resultHead = new ListNode(0, null);
        ListNode resultCur = resultHead;

        while (list1Cur != null || list2Cur != null) {
            if (list1Cur == null) {
                resultCur.next = list2Cur;
                list2Cur = list2Cur.next;
            } else if (list2Cur == null) {
                resultCur.next = list1Cur;
                list1Cur = list1Cur.next;
            } else {
                if (list1Cur.val <= list2Cur.val) {
                    resultCur.next = list1Cur;
                    list1Cur = list1Cur.next;
                } else {
                    resultCur.next = list2Cur;
                    list2Cur = list2Cur.next;
                }
            }
            resultCur = resultCur.next;
        }

        return resultHead.next;
    }
}
