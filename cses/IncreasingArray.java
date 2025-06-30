import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ans += (arr[i] - arr[i + 1]);
                arr[i + 1] = arr[i + 1] + (arr[i] - arr[i + 1]);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}