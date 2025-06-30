import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        solve();
    }

    public static int minCoins(int arr[], int sum, int index, int dp[][]) {
        if (index == arr.length) {
            if (sum == 0) {
                return 0;
            } else
                return 1003;
        }
        if (dp[index][sum] != -1)
            return dp[index][sum];

        // pick
        int pick = Integer.MAX_VALUE;
        if (arr[index] <= sum) {
            pick = 1 + minCoins(arr, sum - arr[index], index, dp);
        }

        // non pick
        int nonPick = minCoins(arr, sum, index + 1, dp);

        return dp[index][sum] = Math.min(pick, nonPick);
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int dp[][] = new int[n + 1][sum+1];
        for (int i = 0; i < n + 1; i++) {
            for(int j=0;j<sum+1;j++)
            dp[i][j] = -1;
        }
        System.out.println(minCoins(arr, sum, 0, dp));
        sc.close();
    }
}
