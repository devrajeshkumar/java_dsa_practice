import java.util.Scanner;

public class A_Homework {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            int m = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            for (int i = 0; i < m; i++) {
                if (c.charAt(i) == 'D') {
                    a = a + b.charAt(i);
                } else {
                    a = b.charAt(i) + a;
                }
            }
            System.out.println(a);

        }
        sc.close();
    }
}