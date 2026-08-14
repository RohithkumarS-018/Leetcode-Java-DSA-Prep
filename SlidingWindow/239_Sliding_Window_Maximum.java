/*
Approach:
1. Use a Deque to store indices of elements.
2. Remove indices that are outside the current window.
3. Remove smaller elements from the back of the deque.
4. Add the current index to the deque.
5. The front of the deque always contains the index of the maximum element.

Time Complexity: O(n)
Space Complexity: O(k)
*/

import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] num, int k) {
        int n = num.length;
        Deque<Integer> q = new ArrayDeque<>();
        int[] arr = new int[n - k + 1];
        int ind=0;

        for (int i=0;i<num.length;i++) {

            while(!q.isEmpty() && q.peekFirst()<=i-k) {
                q.pollFirst();
            }

            while(!q.isEmpty() && num[q.peekLast()]<=num[i]) {
                q.pollLast();
            }

            q.offer(i);

            if (i>=k-1) {
                arr[ind++]= num[q.peekFirst()];
            }
        }
        return arr;
    }
}
