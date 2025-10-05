import java.util.Scanner;

public class B_The_Odd_One_Out {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2)) {
            System.out.println(s.charAt(0));
            return;
        }
        if (s.charAt(n - 1) != s.charAt(n - 2) && s.charAt(n - 1) != s.charAt(n - 3)) {
            System.out.println(s.charAt(n - 1));
            return;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i - 1) && s.charAt(i) != s.charAt(i + 1)) {
                System.out.println(s.charAt(i));
                break;
            }
        }

        sc.close();
    }
}