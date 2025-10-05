import java.util.Scanner;

public class Greedy_DD {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0, result = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            result = sum;
            int start = 0, end = k - 1;
            while (end < n + k) {
                end++;
                sum += arr[end % n];
                sum -= arr[start % n];
                start++;
                result = Math.max(result, sum);
            }
            System.out.println(result);
        }
        sc.close();
    }
}