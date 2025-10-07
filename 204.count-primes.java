/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public void createSieve(int n, int sieve[]) {
        for (int i = 2; i * i < n; i++) {
            if (sieve[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = 1;
                }
            }
        }
    }

    public int countPrimes(int n) {

        int sieve[] = new int[n];
        createSieve(n, sieve);
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (sieve[i] == 0)
                sum += 1;
            sieve[i] = sum;
        }
        if (n <= 2)
            return 0;
        return sieve[n - 1];
    }
}
// @lc code=end
