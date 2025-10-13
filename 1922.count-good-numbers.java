/*
 * @lc app=leetcode id=1922 lang=java
 *
 * [1922] Count Good Numbers
 */

// @lc code=start
class Solution {
    public long power(long base, long pow, long mod) {
        long ans = 1;
        while (pow > 0) {
            if ((pow & 1) > 0) {
                pow = pow - 1;
                ans = (ans * base) % mod;
            }
            pow = pow >> 1;
            base = (base * base) % mod;
        }
        return ans;
    }

    public int countGoodNumbers(long n) {
        long mod = 1000000000 + 9;
        long power5 = power(5, n / 2, mod);
        if ((n & 1) > 1) {
            power5 = (power5 * 5) % mod;
        }
        long power4 = power(4, n / 2, mod);
        System.out.println("powrs " + power4 + " " + power5);
        return (int) ((power4 * power5) % mod);
    }
}
// @lc code=end
