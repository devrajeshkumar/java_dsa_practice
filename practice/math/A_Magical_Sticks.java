import java.util.Scanner;

public class A_Magical_Sticks {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.println(n / 2);
            else
                System.out.println(n / 2 + 1);
            t--;
        }
        sc.close();
    }
}