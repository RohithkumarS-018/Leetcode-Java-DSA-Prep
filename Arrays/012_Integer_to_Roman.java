/*
LeetCode 12 - Integer to Roman
Difficulty: Medium

Approach:
1. Store Roman symbols and their corresponding integer values.
2. Traverse the values from largest to smallest.
3. While the current value is less than or equal to the number:
   - Append the corresponding Roman symbol.
   - Subtract the value from the number.
4. Continue until the number becomes 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class Solution {
    public String intToRoman(int num) {

        String[] roman = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        int[] value = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < value.length; i++) {
            while (num >= value[i]) {
                res.append(roman[i]);
                num -= value[i];
            }
        }

        return res.toString();
    }
}