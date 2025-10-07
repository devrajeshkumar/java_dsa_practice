/*
 * @lc app=leetcode id=1390 lang=java
 *
 * [1390] Four Divisors
 */

// @lc code=start
class Solution {

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0, currentSum = 0;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    currentSum += j;
                    if (num / j != j) {
                        count++;
                        currentSum += num / j;
                    }
                }

            }
            if (count == 2) {
                sum += currentSum;
                sum += num;
                sum += 1;
            }

        }
        return sum;
    }
}
// @lc code=end
