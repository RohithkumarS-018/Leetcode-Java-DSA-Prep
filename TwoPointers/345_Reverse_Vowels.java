/*
Approach:
1. Use two pointers from both ends.
2. Skip characters that are not vowels.
3. When both pointers find vowels, swap them.
4. Continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(n)
*/



class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String v = "AEIOUaeiou";

        while (left <= right) {
            if (v.indexOf(ch[left]) == -1) {
                left++;
                continue;
            }

            if (v.indexOf(ch[right]) == -1) {
                right--;
                continue;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}