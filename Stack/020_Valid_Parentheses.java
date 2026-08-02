/*
LeetCode 20 - Valid Parentheses
Difficulty: Easy

Approach:
1. Create a stack to store opening brackets.
2. Traverse each character in the string.
3. If it is an opening bracket, push it into the stack.
4. If it is a closing bracket:
   - If the stack is empty, return false.
   - Pop the top element and check whether it matches.
5. After processing all characters, return true only if the stack is empty.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}