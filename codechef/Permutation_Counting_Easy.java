import java.io.*;
import java.util.*;

public class Permutation_Counting_Easy {
    static final int MOD = 998244353;
    static final int MAXN = 200000;
    static long[] fact = new long[MAXN + 1];
    static long[] invFact = new long[MAXN + 1];

    public static void main(String[] args) throws Exception {
        precomputeFactorials();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String[] parts = br.readLine().split(" ");
            int N = Integer.parseInt(parts[0]);
            int K = Integer.parseInt(parts[1]); // always 3 here
            long ans = solveForN(N);
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }

    static void precomputeFactorials() {
        fact[0] = 1;
        for (int i = 1; i <= MAXN; i++)
            fact[i] = fact[i - 1] * i % MOD;
        invFact[MAXN] = modInverse(fact[MAXN]);
        for (int i = MAXN; i > 0; i--)
            invFact[i - 1] = invFact[i] * i % MOD;
    }

    static long modPow(long b, long e) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) != 0)
                res = res * b % MOD;
            b = b * b % MOD;
            e >>= 1;
        }
        return res;
    }

    static long modInverse(long x) {
        return modPow(x, MOD - 2);
    }

    static long nCr(int n, int r) {
        if (r < 0 || r > n)
            return 0;
        return fact[n] * invFact[r] % MOD * invFact[n - r] % MOD;
    }

    static long solveForN(int N) {
        int c0 = N / 3;
        int rem = N % 3;
        int c1 = rem >= 1 ? c0 + 1 : c0;
        int c2 = rem >= 2 ? c0 + 1 : c0;

        // Number of valid residue sequences:
        // A compact derived count, combining combinatorics of placing zeros as
        // separators.
        long waysResidues;
        if (c0 == 0) {
            // Only 1s and 2s, no adjacent forbidden block: must be all 1s or all 2s
            waysResidues = (c1 > 0 && c2 == 0 ? 1 : c2 > 0 && c1 == 0 ? 1 : 0);
        } else {
            // Distribute c0 zeros among c1+1 or c2+1 slots from 1 or 2 block perspectives
            long choose1 = nCr(c1 + 1, c0);
            long choose2 = nCr(c2 + 1, c0);
            waysResidues = (choose1 + choose2) % MOD;
        }

        // Multiply by permutations within residue classes
        long part = fact[c0] * fact[c1] % MOD * fact[c2] % MOD;
        return waysResidues * part % MOD;
    }
}