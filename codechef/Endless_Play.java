import java.util.Scanner;

public class Endless_Play {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), h = sc.nextInt();
        System.out.println(((x - 4) * 24 + h));
        sc.close();
    }
}