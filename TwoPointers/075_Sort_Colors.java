/*
    LeetCode 75 - Sort Colors
    Difficulty: Medium

    Approach:
    1. Use three pointers: low, mid, high.
    2. low  -> position for 0
    3. mid  -> current element
    4. high -> position for 2

    Rules:
    - If nums[mid] == 0:
        Swap with low
        low++
        mid++

    - If nums[mid] == 1:
        mid++

    - If nums[mid] == 2:
        Swap with high
        high--
        Do NOT increment mid because
        the new element at mid must be checked.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {

    public void sortColors(int[] nums) {

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while (mid <= high) {

            if (nums[mid]==0) {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1) {
                mid++;
            }

            else { 
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}