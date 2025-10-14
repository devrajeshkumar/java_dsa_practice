import java.io.*;
import java.util.*;

public class B_Two_Arrays_And_Swaps {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        StringBuilder out = new StringBuilder();

        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            int k = fr.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = fr.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = fr.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            int i = 0, j = n - 1;
            while (i < n && j >= 0 && k > 0) {
                if (a[i] < b[j]) {
                    a[i] = b[j];
                    i++;
                    j--;
                    k--;
                } else {
                    break;
                }
            }

            long sum = 0;
            for (int val : a)
                sum += val;
            out.append(sum).append('\n');
        }

        System.out.print(out);
    }

    // ---------- FAST INPUT CLASS ----------
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}
