import java.util.Scanner;

public class MODEX_1230 {
    public static void main(String[] args) {
        solve();
    }

    public static int power(int base, int pow, int mode) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) > 0) {
                pow = pow - 1;
                ans = (ans * base) % mode;
            } else {
                pow = pow >> 1;
                base = (base * base) % mode;

            }
        }
        return ans;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
            System.out.println(power(x, y, n));
        }
        sc.close();
    }
}