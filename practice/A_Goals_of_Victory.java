import java.util.Scanner;

public class A_Goals_of_Victory {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            while (n-- > 1) {
                sum += sc.nextInt();

            }
            System.out.println((-1 * sum));
        }
        sc.close();
    }
}