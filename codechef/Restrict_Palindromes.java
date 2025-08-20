import java.util.Scanner;

public class Restrict_Palindromes {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String pattern = "abc";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(pattern.charAt(i % 3));
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}