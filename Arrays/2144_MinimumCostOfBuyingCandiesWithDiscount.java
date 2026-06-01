/*
Problem: 2144. Minimum Cost of Buying Candies With Discount

Category: Array, Sorting, Greedy

Approach:
1. Sort the array.
2. Traverse from the largest costs.
3. For every group of 3 candies, pay for the two most expensive candies.
4. The third candy is free.
5. Handle the remaining 1 or 2 candies separately.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;

        int sum = 0;

        for (int i = n - 1; i >= 2; i -= 3) {
            sum += cost[i] + cost[i - 1];
        }

        if (n % 3 == 1)
            return sum + cost[0];

        if (n % 3 == 2)
            return sum + cost[0] + cost[1];

        return sum;
    }
}
