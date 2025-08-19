import java.util.Scanner;

public class A_Desorting {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = Integer.MIN_VALUE, dif = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (prev == Integer.MIN_VALUE) {
                    prev = ele;
                    continue;
                }

                dif = Math.min(dif, ele - prev);
                prev = ele;

            }
            if (dif < 0) {
                System.out.println(0);

            } else {
                System.out.println(dif / 2 + 1);
            }
        }
        sc.close();
    }
}