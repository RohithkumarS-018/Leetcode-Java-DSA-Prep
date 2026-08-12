/*
Approach:
1. Use two pointers: i for the position of the next non-zero element.
2. Traverse the array using j.
3. When arr[j] is non-zero, swap arr[i] and arr[j].
4. Increment i.
5. This moves all zeroes to the end while maintaining the order of non-zero elements.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] arr) {
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }
    }
}