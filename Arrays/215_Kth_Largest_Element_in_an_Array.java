// LeetCode 215 - Kth Largest Element in an Array
// Difficulty: Medium

// Approach:
// 1. Store all elements in a LinkedList.
// 2. Sort the list in descending order using Collections.reverseOrder().
// 3. Return the element at index (k - 1).

// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k - 1);
    }
}