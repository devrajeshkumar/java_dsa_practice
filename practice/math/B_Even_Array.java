import java.util.Scanner;

public class B_Even_Array {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (i % 2 == 0 && ele % 2 != 0)
                    even++;
                else if (i % 2 == 1 && ele % 2 != 1)
                    odd++;
            }
            if (even != odd)
                System.out.println("-1");
            else
                System.out.println(even);
            t--;
        }
        sc.close();
    }
}