import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        AllPossibleStrings("abcdefghijklmno");
        sc.close();
    }

    public static List<String> AllPossibleStrings(String s) {
        // Code here
        int n = s.length();
        List<String> ls = new ArrayList<>();
        for (int num = 1; num < (1 << n); num++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) > 0) {
                    sb.append(s.charAt(i));
                }
            }
            // System.out.println(sb.toString());
            ls.add(sb.toString());

        }
        Collections.sort(ls);
        return ls;
    }

    public static int findxor(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 3)
            return 0;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        return 0;
    }

    public static int findXOR(int l, int r) {
        return findxor(r) ^ findxor(l - 1);
    }

    int maxLength(int arr[]) {
        // code here

        HashMap<Integer, Integer> hs = new HashMap<>();
        int max = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0)
                max = i + 1;
            if (hs.containsKey(sum)) {
                max = Math.max(max, i - hs.get(sum) + 1);
            } else {
                hs.put(sum, i);
            }
        }
        return max;

    }

    public int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0, xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            if (xor == k)
                count++;
            if (hs.containsKey(xor ^ k)) {
                count += hs.get(xor ^ k);
            }
            if (hs.containsKey(xor)) {
                hs.put(xor, hs.get(xor) + 1);
            } else
                hs.put(xor, 1);
        }
        return count;
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("sum is for i " + sum + " " + i);
            if (sum == k)
                count++;
            if (hs.containsKey(sum - k)) {
                sum += hs.get(sum - k);
            } else {
                hs.put(sum, 1);
            }
        }
        return count;
    }

    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> hs = new HashMap<>();
        long count = 0;
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            if (xor == k)
                count++;
            if (hs.containsKey(xor ^ k)) {
                count += hs.get(xor ^ k);
            }
            if (hs.containsKey(xor)) {
                hs.put(xor, hs.get(xor) + 1);
            } else
                hs.put(xor, 1);
        }
        return count;
    }
}