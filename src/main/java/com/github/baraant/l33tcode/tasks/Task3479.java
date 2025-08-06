package com.github.baraant.l33tcode.tasks;

/*
3479. Fruits Into Baskets III
Medium
You are given two arrays of integers, fruits and baskets, each of length n, where fruits[i] represents the quantity of the ith type of fruit, and baskets[j] represents the capacity of the jth basket.

From left to right, place the fruits according to these rules:

Each fruit type must be placed in the leftmost available basket with a capacity greater than or equal to the quantity of that fruit type.
Each basket can hold only one type of fruit.
If a fruit type cannot be placed in any basket, it remains unplaced.
Return the number of fruit types that remain unplaced after all possible allocations are made.

Example 1:

Input: fruits = [4,2,5], baskets = [3,5,4]

Output: 1

Explanation:

fruits[0] = 4 is placed in baskets[1] = 5.
fruits[1] = 2 is placed in baskets[0] = 3.
fruits[2] = 5 cannot be placed in baskets[2] = 4.
Since one fruit type remains unplaced, we return 1.

Example 2:

Input: fruits = [3,6,1], baskets = [6,4,7]

Output: 0

Explanation:

fruits[0] = 3 is placed in baskets[0] = 6.
fruits[1] = 6 cannot be placed in baskets[1] = 4 (insufficient capacity) but can be placed in the next available basket, baskets[2] = 7.
fruits[2] = 1 is placed in baskets[1] = 4.
Since all fruits are successfully placed, we return 0.

Constraints:

n == fruits.length == baskets.length
1 <= n <= 10^5
1 <= fruits[i], baskets[i] <= 10^9
*/
public class Task3479 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        SegmentTree tree = new SegmentTree(baskets);

        int count = 0;
        for (int fruit : fruits) {
            int idx = tree.query(0, 0, n - 1, fruit);
            if (idx == -1) {
                count++; // couldn't find a suitable basket
            } else {
                tree.update(0, 0, n - 1, idx); // marked the basket as occupied
            }
        }
        return count;
    }

    static class SegmentTree {
        int[] max;
        int n;

        SegmentTree(int[] arr) {
            n = arr.length;
            max = new int[n * 4];
            build(arr, 0, 0, n - 1);
        }

        void build(int[] arr, int node, int l, int r) {
            if (l == r) {
                max[node] = arr[l];
            } else {
                int m = (l + r) / 2;
                build(arr, node * 2 + 1, l, m);
                build(arr, node * 2 + 2, m + 1, r);
                max[node] = Math.max(max[node * 2 + 1], max[node * 2 + 2]);
            }
        }

        // Find the leftmost basket with capacity >= target
        int query(int node, int l, int r, int target) {
            if (max[node] < target) return -1;
            if (l == r) return l;
            int m = (l + r) / 2;
            int res = query(node * 2 + 1, l, m, target);
            if (res != -1) return res;
            return query(node * 2 + 2, m + 1, r, target);
        }

        // Occupy the basket (set the capacity to 0)
        void update(int node, int l, int r, int idx) {
            if (l == r) {
                max[node] = 0;
            } else {
                int m = (l + r) / 2;
                if (idx <= m) update(node * 2 + 1, l, m, idx);
                else update(node * 2 + 2, m + 1, r, idx);
                max[node] = Math.max(max[node * 2 + 1], max[node * 2 + 2]);
            }
        }
    }
}
