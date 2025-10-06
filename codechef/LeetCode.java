import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        String s = "))(()()))";
        int k = 1;
        System.out.println(removeSubstring(s, k));
    }

    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                sum += nums[i];
            else
                sum -= nums[i];
        }
        return sum;
    }

    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasNonZero = false;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            if (nums[i] != 0) {
                hasNonZero = true;
            }
        }
        if (xor != 0)
            return nums.length;
        else {
            if (hasNonZero)
                return nums.length - 1;
            else
                return 0;
        }

    }

    public static String removeSubstring(String s, int k) {
        boolean flag = true;
        int arr[] = new int[100000 + 5];
        StringBuilder sb = new StringBuilder();
        while (flag) {
            ArrayList<Integer> ls = new ArrayList<>();

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '(' && s.charAt(i + 1) == ')')
                    ls.add(i);
            }
            for (int num : ls) {

                int left = num, right = num + 1;
                while (left >= 0 && right < s.length() && s.charAt(left) == '(' && s.charAt(right) == ')') {
                    left--;
                    right++;
                }
                int total = (right - left + 1) / 2;
                total -= 1;
                int req = total - total % k;

                if (total >= k) {
                    flag = true;
                    left = num;
                    right = num + 1;
                    while (req-- > 0) {

                        arr[left] = 1;
                        arr[right] = 1;
                        left--;
                        right++;

                    }
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (arr[i] == 0) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();

    }

    public int maxDistance(int[] position, int m) {
        int l = 1, r = 1000000000;
        int ans = 0;
        Arrays.sort(position);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int start = 0, total = 1;
            for (int i = 1; i < position.length; i++) {
                if ((position[i] - position[start]) >= mid) {
                    total++;
                    start = i;
                }
            }
            if (total >= m) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int minTime(int[] arr, int k) {
        // code here
        int l = Integer.MAX_VALUE, r = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            l = Math.min(l, arr[i]);
            r += arr[i];
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int total = 0, count = 0;

            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
                if (total > mid) {
                    total = arr[i];
                    count++;
                }
            }
            if (total > 0) {
                count++;
            }
            if (count == k) {
                r = mid - 1;
                ans = mid;
            } else if (count > k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
