import java.util.Scanner;

public class A_We_Need_the_Zero {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int xor = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                xor ^= ele;
            }
            if (xor == 0)
                System.out.println(0);
            else if ((n & 1) == 1)
                System.out.println(xor);
            else
                System.out.println(-1);
        }
        sc.close();
    }
}