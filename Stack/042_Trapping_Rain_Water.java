/*
LeetCode 42 - Trapping Rain Water
Difficulty: Hard

Approach:
1. If the array size is less than 3, no water can be trapped.
2. Store the maximum height from the right side using a stack.
3. Maintain the maximum height from the left while traversing.
4. For each position, calculate:
      water = min(leftMax, rightMax) - currentHeight
5. Add the trapped water if it is positive.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        int leftMax = height[0];
        st.push(height[height.length - 1]);
        for (int i = height.length - 2; i >= 1; i--) {
            st.push(Math.max(height[i], st.peek()));
        }
        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int minHeight = Math.min(leftMax, st.peek());
            st.pop();
            water += Math.max(0, minHeight - height[i]);
            leftMax = Math.max(leftMax, height[i]);
        }
        return water;
    }
}