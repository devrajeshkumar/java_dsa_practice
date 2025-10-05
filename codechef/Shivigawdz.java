import java.util.Scanner;

public class Shivigawdz {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), b = sc.nextInt(), a = sc.nextInt();
            int preSum[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
                preSum[i] = sum;
            }
            for (int i = 1; i <= (b - a); i++) {
                int start = a;
                sum = 0;
                for (int j = i + a; j < b; j++) {

                }
            }
        }
        sc.close();
    }
}