/*
Approach:
1. Use a sliding window with two pointers i and j.
2. Multiply nums[j] into the current product.
3. If product becomes >= k, move i forward and divide nums[i].
4. For every j, there are (j - i + 1) valid subarrays ending at j.
5. Add them to the count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int sum = 1;
        int c = 0;

        if (k <= 1) {
            return 0;
        }
        while (j < nums.length) {
            sum *= nums[j];
            while (sum >= k) {
                sum = sum / nums[i];
                i++;
            }
            c += (j - i + 1);
            j++;
        }
        return c;
    }
}