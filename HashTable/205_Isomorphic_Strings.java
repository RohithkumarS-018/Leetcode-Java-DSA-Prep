/*
LeetCode 205 - Isomorphic Strings
Difficulty: Easy

Approach:
1. Use two HashMaps to maintain one-to-one character mapping.
2. Traverse both strings simultaneously.
3. If an existing mapping conflicts, return false.
4. Otherwise, store the mapping in both directions.
5. If no conflicts are found, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if (map.containsKey(ch) && map.get(ch) != c) {
                return false;
            }
            if (map1.containsKey(c) && map1.get(c) != ch) {
                return false;
            }
            map.put(ch, c);
            map1.put(c, ch);
        }
        return true;
    }
}