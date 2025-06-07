import java.util.Scanner;

public class MinOperation {
    public static void main(String[] args) {
        solve();
    }

    public static int findMin(int n, int index, int dp[]) {
        if (index == n) {
            return 0;
        }
        if (dp[index] != -1)
            return dp[index];
        int oneStep = 1000005;
        if (index + 1 < n)
            oneStep = 1 + findMin(n, index + 1, dp);
        int twoStep = 1000005;
        if (index != 0 && 2 * index <= n) {
            twoStep = 1 + findMin(n, index * 2, dp);
        }

        return dp[index] = Math.min(oneStep, twoStep);
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 2];
        for (int i = 0; i < n + 2; i++) {
            dp[i] = -1;
        }
        if (n % 2 == 0) {
            System.out.println(findMin(n, 0, dp));
        } else {
            System.out.println(findMin(n - 1, 0, dp) + 1);
        }

        sc.close();
    }
}
