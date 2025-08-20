import java.util.Scanner;

public class Chef_Bakes_Cake {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int canCary = y / x;
        if (n % canCary == 0)
            System.out.println(n / canCary);
        else
            System.out.println(n / canCary + 1);
        sc.close();
    }
}