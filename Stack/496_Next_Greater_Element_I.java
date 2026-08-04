/*
LeetCode 496 - Next Greater Element I
Difficulty: Easy

Approach:
1. Traverse the array from right to left.
2. Use a monotonic decreasing stack.
3. Remove all smaller or equal elements from the stack.
4. If the stack is empty, store -1.
5. Otherwise, the top of the stack is the next greater element.
6. Push the current element into the stack.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return nge;
    }
}