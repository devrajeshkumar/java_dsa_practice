import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1, ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                ans = Math.max(count, ans);
                count = 1;
            }
        }
        ans = Math.max(count, ans);
        System.out.println(ans);
        sc.close();
    }
}