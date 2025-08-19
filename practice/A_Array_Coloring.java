import java.util.Scanner;

public class A_Array_Coloring {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if ((ele & 1) == 1)
                    odd++;
                else
                    even++;
            }
            if (even == n || (odd == n && (odd & 1) != 1))
                System.out.println("YES");
            else if ((odd & 1) != 1 && even > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}