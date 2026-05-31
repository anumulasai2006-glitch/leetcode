/*
Problem: Destroying Asteroids

Approach:
1. Sort the asteroids in ascending order.
2. Always destroy the smallest asteroid available.
3. If current mass is less than an asteroid's mass, return false.
4. Otherwise absorb its mass and continue.

Mistake Identified:
- Initially used int for mass accumulation.
- The solution failed for large test cases because the planet's mass
  can exceed Integer.MAX_VALUE, causing overflow.
- Replaced int with long to handle larger values safely.

Time Complexity: O(n log n)
Space Complexity: O(1) (excluding sorting space)
*/

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long m = mass;

        for (int asteroid : asteroids) {
            if (m < asteroid) {
                return false;
            }
            m += asteroid;
        }

        return true;
    }
}
