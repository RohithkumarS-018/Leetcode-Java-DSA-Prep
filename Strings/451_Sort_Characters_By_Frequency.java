/*
LeetCode 451 - Sort Characters By Frequency
Difficulty: Medium

Approach:
1. Count the frequency of each character using a HashMap.
2. Store all unique characters in a List.
3. Sort the list based on frequency in descending order.
4. Append each character to the result according to its frequency.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder res = new StringBuilder();
        for (char ch : list) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                res.append(ch);
            }
        }

        return res.toString();
    }
}