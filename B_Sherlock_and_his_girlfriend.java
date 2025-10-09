import java.util.Scanner;

public class B_Sherlock_and_his_girlfriend {
    public static void main(String[] args) {
        solve();
    }

    public static void createSieve(int n, boolean sieve[]) {
        for (int i = 2; i * i < n; i++) {
            if (!sieve[i]) {
                for (int j = i * i; j < n; j += i) {
                    sieve[j] = true;
                }
            }
        }
    }

    public static void solve() {
        int n = 100005;
        Scanner sc = new Scanner(System.in);
        boolean sieve[] = new boolean[n];
        createSieve(n, sieve);
        int num = sc.nextInt();
        if (num <= 2) {
            System.out.println(1);
        } else
            System.out.println(2);
        // System.out.print("2 ");
        for (int i = 2; i <= num + 1; i++) {
            if (!sieve[i])
                System.out.print("1 ");
            else
                System.out.print("2 ");
        }

        sc.close();

    }
}