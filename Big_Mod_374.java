import java.util.Scanner;

public class Big_Mod_374 {
    public static void main(String[] args) {
        solve();
    }

    public static long power(long base, long pow, long mode) {
        long ans = 1;
        while (pow > 0) {
            if ((pow & 1) > 0) {
                pow = pow - 1;
                ans = (base * ans) % mode;
            } else {
                base = (base * base) % mode;
                pow = pow >> 1;
            }
        }
        return ans;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long x = sc.nextLong(), y = sc.nextLong(), n = sc.nextLong();
            System.out.println(power(x, y, n));
        }

        sc.close();

    }
}