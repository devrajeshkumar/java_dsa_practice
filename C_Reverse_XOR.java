import java.util.HashSet;
import java.util.Scanner;

public class C_Reverse_XOR {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashSet<Integer> valid = new HashSet<>();
        for (int a = 1; a < 31; a++) {
            for (int b = 0; b < a; b++) {
                valid.add(((1 << a) - 1) ^ ((1 << b) - 1));
            }
        }
        valid.add(0);
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(valid.contains(n) ? "YES" : "NO");
        }
        sc.close();
    }
}