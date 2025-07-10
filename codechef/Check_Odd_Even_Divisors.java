import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Check_Odd_Even_Divisors {

    public static void main(String[] args) throws java.lang.Exception {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a >= 1 && b % a == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }

    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int gap[] = new int[n + 1];
        gap[0] = startTime[0];
        for (int i = 1; i <= n; i++) {
            gap[i] = startTime[i] - endTime[i - 1];

        }
        gap[n] = eventTime - endTime[n - 1];

        int[] largestRight = new int[gap.length];
        for (int i = gap.length - 2; i >= 0; i--) {
            largestRight[i] = Math.max(largestRight[i + 1], gap[i + 1]);
        }

        int ans = 0, largestLeft = 0;
        for (int i = 1; i < gap.length; i++) {
            int curGap = endTime[i - 1] - startTime[i - 1];
            if (curGap <= Math.max(largestLeft, largestRight[i])) {
                ans = Math.max(ans, gap[i - 1] + gap[i] + curGap);
            }
            ans = Math.max(ans, gap[i - 1] + gap[i]);
            largestLeft = Math.max(largestLeft, gap[i - 1]);
        }
        return ans;

    }
}