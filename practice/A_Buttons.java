import java.util.Scanner;

public class A_Buttons {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (c % 2 == 0) {
                if (a > b)
                    System.out.println("First");
                else
                    System.out.println("Second");
            } else {
                if (b > a)
                    System.out.println("Second");
                else
                    System.out.println("First");
            }
        }
        sc.close();
    }
}