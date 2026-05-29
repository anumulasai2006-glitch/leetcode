/*
LeetCode Problem: Minimum Element After Replacement With Digit Sum
Topic: Arrays, Math
Difficulty: Easy
*/

import java.util.*;

class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (nums[i] > 0) {
                sum += nums[i] % 10;
                nums[i] /= 10;
            }
            ans[i] = sum;
        }

        Arrays.sort(ans);
        return ans[0];
    }
}
