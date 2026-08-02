/*
LeetCode 128 - Longest Consecutive Sequence
Difficulty: Medium

Approach:
1. Sort the array.
2. Ignore duplicate elements.
3. If consecutive elements differ by 1, increase the count.
4. Otherwise, update the maximum count and reset the current count.
5. Return the maximum sequence length.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.*;

class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                  count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}

