// LeetCode 189 - Rotate Array
// Difficulty: Medium
//
// Approach:
// 1. Create a temporary array of the same size.
// 2. Place each element at its new rotated position using (i + k) % n.
// 3. Copy the temporary array back to the original array.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return;
        }
        k %= n;
        if (k == 0) {
            return;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}