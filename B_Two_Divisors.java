import java.util.Scanner;

public class B_Two_Divisors {
    public static void main(String[] args) {
        solve();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            a = a % b;
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            long result = 0;
            if (b % a == 0) {
                result = b * (b / a);
            } else {
                result = (b) * (a / gcd(a, b));
            }
            System.out.println(result);
        }
        sc.close();
    }
}