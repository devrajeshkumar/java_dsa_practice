import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(splitArray(new int[] { 1, 3, 2 }));
        sc.close();
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            arr[i] *= curr;
            curr = curr * nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] *= curr;
            curr = curr * nums[i];
        }
        return arr;
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

    public long zeroFilledSubarray(int[] nums) {
        int count = 1, n = nums.length, sum = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == 0) {
                count++;
            } else {
                if (nums[i - 1] == 0) {
                    sum += ((count * (count + 1)) / 2);
                }
                count = 1;
            }
        }
        if (nums[n - 1] == 0) {
            sum += ((count * (count + 1)) / 2);
        }
        return sum;
    }

    public boolean increasingTriplet(int[] arr) {
        int n = arr.length;
        if (n <= 2)
            return false;
        int num1 = Integer.MAX_VALUE, num2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (num1 >= arr[i])
                num1 = arr[i];
            else if (num2 >= arr[i])
                num2 = arr[i];
            else
                return true;
        }
        return false;
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println("end of stack");
    }

    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        for (int num : nums) {
            while (stack.size() != 0) {
                int top = stack.get(stack.size() - 1);
                int gcd = getGcd(top, num);
                if (gcd == 1)
                    break;
                stack.remove(stack.size() - 1);
                num = (top * num) / gcd;
            }
            stack.add(num);
        }
        return stack;
    }

    public boolean isSubsequence(String s, String t) {
        int si = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(si) == t.charAt(i)) {
                si++;
            }
        }
        if (si == s.length())
            return true;
        return false;
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char left = Character.toLowerCase(s.charAt(l));
            char right = Character.toLowerCase(s.charAt(r));

            if (!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if (!Character.isLetterOrDigit(s.charAt(r)))
                r--;

            else if (left != right)
                return false;
            l++;
            r--;

        }
        return true;
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean found = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() > i && strs[0].charAt(i) != strs[j].charAt(i)) {
                    found = false;
                    break;
                }
            }
            if (!found) {
                break;
            } else {
                sb.append(strs[0].charAt(i));
            }
        }
        return sb.toString();
    }

    public int maxNumberOfBalloons(String text) {
        String b = "balloon";
        int arr[] = new int[26];
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'l' || b.charAt(i) == 'o')
                ans = Math.min(ans, (arr[b.charAt(i) - 'a']) / 2);
            else
                ans = Math.min(ans, (arr[b.charAt(i) - 'a']));
        }
        return ans;
    }

    public int numIdenticalPairs(int[] nums) {
        int arr[] = new int[101];
        for (int num : nums)
            arr[num]++;
        int sum = 0;
        for (int count : arr) {
            sum += (count * (count - 1)) / 2;
        }
        return sum;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.containsKey(s.charAt(i))) {
                if (hs.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else if (hs.containsKey(t.charAt(i))) {
                if (hs.get(t.charAt(i)) != s.charAt(i))
                    return false;
            } else
                hs.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (arr[magazine.charAt(i) - 'a'] > 0) {
                arr[magazine.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0)
                return false;
        }
        return true;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                if (hs.get(nums[i]).size() == 2) {
                    hs.get(nums[i]).set(1, i);
                } else {
                    hs.get(nums[i]).add(i);
                }

            } else {
                hs.put(nums[i], new ArrayList<>(Arrays.asList(i)));
            }
            if (hs.get(nums[i]).size() == 2) {
                int diff = hs.get(nums[i]).get(1) - hs.get(nums[i]).get(0);
                System.out.println("num diff " + nums[i] + " " + diff);
                if (diff <= k)
                    return true;
            }
        }
        for (int key : hs.keySet()) {
            System.out.print(key + ": => ");
            for (int num : hs.get(key)) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
        return false;
    }

    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        int maxFr = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
            maxFr = Math.max(maxFr, arr[nums[i]]);
        }
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (arr[i] == maxFr) {
                count += maxFr;
            }
        }
        return count;
    }

    public static int[] decimalRepresentation(int n) {
        ArrayList<Integer> ls = new ArrayList<>();
        int base = 1;
        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                ls.add(digit * base);
            }
            n = n / 10;
            base = base * 10;
        }
        int arr[] = new int[ls.size()];
        int start = 0;
        for (int i = ls.size() - 1; i >= 0; i--) {
            arr[start++] = ls.get(i);
        }

        return arr;
    }

    public static long splitArray(int[] nums) {
        int n = nums.length;
        if (n == 2)
            return Math.abs(nums[0] - nums[1]);
        long arr[] = new long[n];
        arr[0] = nums[0];
        int peaks = 0;
        int peakIndex = 0;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1] + nums[i];
            if (i < n - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                peaks++;
                peakIndex = i;
            }
        }
        for (int i = 1; i <= peakIndex; i++) {
            if (nums[i] < nums[i - 1])
                return -1;
        }
        for (int i = peakIndex + 1; i < n - 1; i++) {
            if (nums[i] < nums[i + 1])
                return -1;
        }
        if (peaks > 1 || peaks == 0)
            return -1;

        long result1 = Math.abs(arr[peakIndex - 1] - (arr[n - 1] - arr[peakIndex - 1]));
        long result2 = Math.abs(arr[peakIndex] - (arr[n - 1] - arr[peakIndex]));
        return Math.min(result1, result2);

    }
}
