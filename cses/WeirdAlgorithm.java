import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
        }
        System.out.println(1);
        sc.close();
    }
}
