import java.util.Scanner;

public class Two_Rolls {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            boolean flag = false;
            for (int i = y; i < y + 6; i++) {
                for (int j = y; j < y + 6; j++) {
                    if (x + i + j == 50) {
                        flag = true;
                    }
                }
            }
            if (flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}