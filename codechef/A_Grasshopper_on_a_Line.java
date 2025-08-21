import java.util.Scanner;

public class A_Grasshopper_on_a_Line {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n < k) {
                System.out.println(1);
                System.out.println(n);
            } else if (n % k != 0) {
                System.out.println(1);
                System.out.println(n);
            } else {
                System.out.println(2);
                System.out.println((n - k - 1) + " " + (k + 1));
            }
        }
        sc.close();
    }
}