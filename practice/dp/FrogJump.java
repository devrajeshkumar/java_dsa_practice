import java.util.Scanner;

public class FrogJump {

    public static void main(String[] args) {
        solve();
    }

    public static int findMin(int arr[], int index, int dp[]) {
        if (index == arr.length - 1)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int oneStep = Math.abs(arr[index] - arr[index + 1]) + findMin(arr, index + 1, dp);
        int twoStep = Integer.MAX_VALUE;
        if (index + 2 < arr.length) {
            twoStep = Math.abs(arr[index] - arr[index + 2]) + findMin(arr, index + 2, dp);
        }
        return dp[index] = Math.min(oneStep, twoStep);
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int dp[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++)
            dp[i] = -1;
        System.out.println(findMin(arr, 0, dp));

    }
}