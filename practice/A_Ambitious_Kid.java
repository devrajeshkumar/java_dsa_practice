import java.util.Scanner;

public class A_Ambitious_Kid {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            min = Math.min(min, Math.abs(value));
        }
        System.out.println(min);

        sc.close();
    }
}