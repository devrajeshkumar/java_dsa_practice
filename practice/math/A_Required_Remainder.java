import java.util.Scanner;

public class A_Required_Remainder {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            if (n % x == y)
                System.out.println(n);
            else if (y == 0)
                System.out.println(0);
            else
                System.out.println(n - (n % x + Math.abs(x - y)));
            t--;
        }
        sc.close();
    }
}