public class Printing_some_primes {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int n = 100000000 - 1;
        boolean sieve[] = new boolean[n + 1];

        // Only handle odd numbers (2 handled separately)
        for (int i = 3; i * i <= n; i += 2) {
            if (!sieve[i]) {
                for (int j = i * i; j <= n; j += 2 * i) {
                    sieve[j] = true;
                }
            }
        }

        int count = 1; // prime 2
        StringBuilder sb = new StringBuilder(1 << 20); // preallocate ~1MB
        if (count % 100 == 1)
            sb.append(2).append("\n");

        for (int i = 3; i <= n; i += 2) {
            if (!sieve[i]) {
                count++;
                if (count % 100 == 1)
                    sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}
