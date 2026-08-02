// LeetCode 347 - Top K Frequent Elements
// Difficulty: Medium
//
// Approach:
// 1. Count the frequency of each element using a HashMap.
// 2. Create a Max Heap (PriorityQueue) based on frequency.
// 3. Add all unique elements to the heap.
// 4. Remove the top k frequent elements from the heap.
//
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
map.put(num, map.getOrDefault(num, 0) + 1);    
    }
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        q.addAll(map.keySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = q.poll();
        }

        return ans;
    }
}