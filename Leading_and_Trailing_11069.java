import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leading_and_Trailing_11069 {
    public static void main(String[] args) {
        solve();
    }

    public static long power(long n, long k, long mod) {
        long res = 1;
        n %= mod;
        while (k > 0) {
            if ((k & 1) == 1)
                res = (res * n) % mod;
            n = (n * n) % mod;
            k >>= 1;
        }
        return res;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long mod = 999999 + 1;
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextInt(), y = sc.nextInt();
            long ans = power(x, y, mod);
            long res = 123456;
            System.out.println("ans is " + (res * res) + " powr " + ans);
            List<Integer> ls = new ArrayList<>();
            while (ans > 0) {
                int rem = (int) ans % 10;
                ls.add(rem);
                ans = (int) ans / 10;
            }
            int sz = ls.size();

            if (ls.size() >= 6) {
                System.out.println("" +
                        ls.get(sz - 1) + ls.get(sz - 2) + ls.get(sz - 3) + "..." + ls.get(2) + ls.get(1) + ls.get(0));
            }
        }
        sc.close();
    }
}