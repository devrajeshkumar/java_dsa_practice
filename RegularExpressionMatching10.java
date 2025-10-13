import java.util.HashMap;

public class RegularExpressionMatching10 {
    public boolean isMatch(String s, String p) {
        return true;
    }

    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int num : nums) {
            if (hs.containsKey(num)) {
                hs.put(num, hs.get(num) + 1);
            } else {
                hs.put(num, 1);
            }
        }
        int sum = 0;
        for (int key : hs.keySet()) {
            if (hs.get(key) % k == 0) {
                sum += (key * hs.get(key));
            }
        }
        return sum;
    }

}
