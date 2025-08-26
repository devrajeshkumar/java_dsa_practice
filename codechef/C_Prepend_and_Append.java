import java.util.Scanner;

public class C_Prepend_and_Append {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int l = 0, r = n - 1;
            while (l <= r) {
                if ((s.charAt(l) == '0' && s.charAt(r) == '1') || (s.charAt(r) == '0' && s.charAt(l) == '1')) {
                    l++;
                    r--;
                } else {
                    break;
                }
            }
            System.out.println((r - l + 1));
        }
        sc.close();
    }
}