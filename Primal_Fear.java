import java.util.Scanner;

public class Primal_Fear {
    public static void main(String[] args) {
        solve();
    }

    public static void createSieve(boolean sieve[], int n) {
        sieve[0] = sieve[1] = true;
        for (int i = 4; i <= n; i += 2)
            sieve[i] = true;
        for (int i = 3; i * i <= n; i += 2) {
            if (!sieve[i]) {
                for (int j = i * i; j <= n; j += 2 * i)
                    sieve[j] = true;
            }
        }
    }

    public static boolean containZero(int num) {
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0)
                return true;
            num = num / 10;
        }
        return false;
    }

    public static void solve() {
        int size = 1000000;
        boolean sieve[] = new boolean[size + 1];
        createSieve(sieve, size);
        int preCount[] = new int[size + 1];
        for (int i = 2; i <= size; i++) {
            preCount[i] = preCount[i - 1];
            if (!sieve[i] && !containZero(i)) {
                preCount[i]++;
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(preCount[n]);
        }
        sc.close();
    }
}