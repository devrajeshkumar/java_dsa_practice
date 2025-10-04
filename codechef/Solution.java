import java.util.ArrayList;
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

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here

        int sum = 0, start = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (sum > target) {
                sum -= arr[start++];
            }
            if (sum == target) {
                ans.add(start);
                ans.add(i + 1);
                break;
            }
            sum += arr[i];
            System.out.println("sum is " + sum);
        }
        if (sum == target) {
            ans.add(start + 1);
            ans.add(arr.length);

        }
        return ans;

    }

    int missingNum(int arr[]) {
        // code here
        int missing = 0;
        for (int i = 0; i < arr.length; i++) {
            missing = missing ^ (i + 1) ^ arr[i];
        }
        missing = missing ^ (arr.length + 1);
        return missing;
    }

    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1, second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        return second;

    }

    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0)
                currSum = 0;
        }
        maxSum = Math.max(maxSum, currSum);
        return maxSum;
    }

    public int find(int start, int arr[]) {
        if (start == arr.length - 1)
            return 0;
        if (start >= arr.length || arr[start] == 0)
            return -1;
        long ans = Integer.MIN_VALUE;
        for (int i = 1; i <= arr[start]; i++) {
            ans = Math.min(ans, find(start + i, arr));
        }
        return (int) ans;
    }

    public int minJumps(int[] arr) {
        // code here
        return find(0, arr);

    }
}
