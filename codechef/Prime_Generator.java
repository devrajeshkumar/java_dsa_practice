import java.util.ArrayList;
import java.util.Scanner;

public class Prime_Generator {
    static int sieve[] = new int[100005];

    public static void main(String[] args) {
        solve();
    }

    public static void createSieve() {
        sieve[0] = 1;
        sieve[1] = 1;
        for (int i = 2; i * i < 100005; i++) {
            if (sieve[i] == 0) {
                for (int j = i * i; j < 100005; j += i) {
                    sieve[j] = 1;
                }
            }
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        createSieve();
        while (t-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt();
            ArrayList<Integer> ls = new ArrayList<>();
            for (int i = 2; i * i <= r; i++) {
                if (sieve[i] == 0)
                    ls.add(i);
            }
            if (l == 1) {
                for (int i = 2; i <= r; i++) {
                    if (sieve[i] == 0)
                        System.out.println(i);
                }
            } else {
                int dummy[] = new int[r - l + 1];
                for (int prime : ls) {
                    int firstMultiple = l % prime == 0 ? l : l + l % prime;
                    for (int j = Math.max(firstMultiple, prime * prime); j <= r; j += prime) {
                        dummy[j - l] = 1;
                    }
                }

                for (int i = 0; i < r - l + 1; i++) {
                    if (dummy[i] == 0)
                        System.out.println(i + l);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}