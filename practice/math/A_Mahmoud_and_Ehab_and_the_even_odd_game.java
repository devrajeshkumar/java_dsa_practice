import java.util.Scanner;

public class A_Mahmoud_and_Ehab_and_the_even_odd_game {

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Mahmoud");
        } else {
            System.out.println("Ehab");
        }
        sc.close();
    }
}