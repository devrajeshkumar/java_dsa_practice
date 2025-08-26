import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public int maximumLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            int sum = (nums[i] + nums[i - 1]) % 2;
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
            ans = Math.max(ans, map.get(sum));

        }
        return ans + 1;
    }

    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;

        if (k * k != n) {
            return false;
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int ele : nums) {
            if (hs.containsKey(ele)) {
                hs.put(ele, hs.get(ele) + 1);
            } else {
                hs.put(ele, 1);
            }
        }
        for (Integer key : hs.keySet()) {
            if (hs.get(key) > k) {
                return false;
            }
        }
        return true;
    }

    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int curr = 1, last = -1, first = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == nums[i++])
                curr++;
            else {
                last = i - 1;
            }
        }
        return 0;
    }

    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        int diag = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDiag = l * l + w * w;
            int currArea = l * w;
            if (currDiag > diag) {
                diag = currDiag;
                ans = currArea;
            } else if (currDiag == diag) {
                ans = Math.max(ans, currArea);
            }
        }
        return ans;
    }
}
