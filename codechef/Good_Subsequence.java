import java.util.Scanner;

public class Good_Subsequence {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int last = arr[i];
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 != last % 2) {
                        count++;
                        last = arr[j];
                    }
                }
                ans = Math.max(ans, count);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}