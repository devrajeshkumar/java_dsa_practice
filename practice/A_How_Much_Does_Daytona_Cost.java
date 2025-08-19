import java.util.Scanner;

public class A_How_Much_Does_Daytona_Cost {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (ele == k) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
        sc.close();
    }
}