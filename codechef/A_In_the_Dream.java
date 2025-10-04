import java.util.Scanner;

public class A_In_the_Dream {
    public static void main(String[] args) {
        solve();
    }

    public static boolean valid(int x, int y) {
        int mx = Math.max(x, y);
        int mn = Math.min(x, y);
        return mx <= 2 * (mn + 1);
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

            boolean firstHalf = valid(a, b);
            boolean secondHalf = valid(c - a, d - b);

            if (firstHalf && secondHalf) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}