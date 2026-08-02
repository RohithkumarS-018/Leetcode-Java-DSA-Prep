// LeetCode 1 - Two Sum
// Difficulty: Easy
//
// Approach:
// 1. Create a HashMap to store number and its index.
// 2. For each element, calculate the complement (target - current number).
// 3. If the complement exists in the HashMap, return both indices.
// 4. Otherwise, store the current number and its index.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {                                
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}