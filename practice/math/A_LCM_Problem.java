import java.util.Scanner;

public class A_LCM_Problem {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (2 * a > b) {
                System.out.println(-1 + " " + (-1));
            } else {
                System.out.println(a + " " + a * 2);
            }
        }
        sc.close();
    }
}