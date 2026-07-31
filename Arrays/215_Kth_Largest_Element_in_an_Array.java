// LeetCode 215 - Kth Largest Element in an Array
// Difficulty: Medium
// https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list, Collections.reverseOrder());

        return list.get(k - 1);
    }
}