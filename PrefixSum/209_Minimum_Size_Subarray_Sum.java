/*
    LeetCode 209 - Minimum Size Subarray Sum
    Difficulty: Medium

    Approach:
    1. Use Sliding Window.
    2. j expands the window and adds nums[j] to sum.
    3. When sum >= target, calculate the window length.
    4. Move i forward to make the window smaller.
    5. Continue until j reaches the end.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {

    public int minSubArrayLen(int t, int[] nums) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j<nums.length) {
            sum += nums[j];
            while (sum>=t) {
                min = Math.min(min,j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}