import java.util.Scanner;

public class A_Two_Permutations {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            if (a + b + 2 <= n || (n == a && a == b))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}