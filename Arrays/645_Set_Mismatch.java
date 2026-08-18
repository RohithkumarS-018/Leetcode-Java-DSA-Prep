/*
Approach:
1. Create an array ark containing numbers from 1 to n.
2. Compare each number in ark with the given nums array.
3. Count how many times each number appears in nums.
4. If a number appears 2 times, it is the duplicate number.
5. If a number appears 0 times, it is the missing number.
6. Store the duplicate and missing numbers in the result array.

Time Complexity: O(n²)
Space Complexity: O(n)
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
  
        int index = 0;
        int ark[] = new int[nums.length];
        int v[] = new int[2];

        for (int i=1; i<=nums.length;i++) {
            ark[index++]=i;
        }

        for (int i=0;i<nums.length;i++) {
            int c=0;

            for (int j=0;j<nums.length;j++) {
                if (ark[i]==nums[j]) {
                    c++;
                }
            }

            if (c==2) {
                v[0]=ark[i];
            }
            if (c==0) {
                v[1]=ark[i];
            }
        }
        return v;
    }
}